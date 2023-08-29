package codility.lessons.lesson10_primeAndCompositeNumbers;

public class MinPerimeterRectangle {
    public int findMinPerimeter(int N){
        int minPerimeter = Integer.MAX_VALUE;

        int i = 1;
        while(i * i < N){
            if(N % i == 0){
                int a = i;
                int b = N / i;
                minPerimeter = findMinPerimeter(a, b, minPerimeter);
            }
            i++;
        }
        if(i * i == N){
            minPerimeter = findMinPerimeter(i, i, minPerimeter);
        }
        return minPerimeter;
    }
    private int findMinPerimeter(int a, int b, int minPerimeter){
        int perimeter = 2 * (a + b);
        return Math.min(perimeter, minPerimeter);
    }
}
