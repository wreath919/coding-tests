package no_platform;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created REST API that counts how many times a word appeared in a book.
 * Usage to search for word "talk": http://localhost:8000/search?word=talk
 */
public class ThroughputHttpServer {
    private static final String INPUT_FILE = "src/main/resources/throughput/war_and_peace.txt";
    private static final int NUMBER_OF_THREADS = 1;

    public static void main(String [] args) throws IOException {
        Path path = Paths.get(INPUT_FILE);
        String text = new String(Files.readAllBytes(path));
        startServer(text);
    }
    private static void startServer(String text) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/search", new WordCountHandler(text));
        Executor executor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
        server.setExecutor(executor);
        server.start();
    }

    private static class WordCountHandler implements HttpHandler {
        String text;

        public WordCountHandler(String text){
            this.text = text;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String query = exchange.getRequestURI().getQuery();
            String[] keyValue = query.split("=");
            String action = keyValue[0];
            String word = keyValue[1];
            if(!action.equals("word")){
                exchange.sendResponseHeaders(400, 0);
                return;
            }

            long count = countWord(word);

            byte[] response = Long.toString(count).getBytes();
            exchange.sendResponseHeaders(200, response.length);
            OutputStream outputStream = exchange.getResponseBody();
            outputStream.write(response);
            outputStream.close();
        }

        private long countWord(String word){
            long count = 0;
            int index = 0;
            while(index >= 0){
                index = text.indexOf(word, index);

                if(index >= 0){
                    count++;
                    index++;
                }
            }
            return count;
        }
    }
}