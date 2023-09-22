package no_platform;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CacheTest {
    Cache cache;

    @BeforeAll
    void setup(){
        cache = new Cache();
    }

    @Test
    void test_firstOne_cacheMiss(){
        int n = 1;
        boolean expected = false;
        boolean actual = cache.getFromCache(n);
        assertEquals(expected, actual);

        List<Integer> expectedList = new LinkedList<>(List.of(1));
        List<Integer> actualList = cache.getLinkedList();
        assertEquals(expectedList.size(), actualList.size());
        int sameNumCount = 0;
        for(int i = 0; i < expectedList.size(); i++){
            if(Objects.equals(expectedList.get(i), actualList.get(i))) sameNumCount++;
        }
        assertEquals(sameNumCount, expectedList.size());
    }
    @Test
    void test_secondOne_cacheHit(){
        int n = 1;
        cache.getFromCache(n);

        n = 2;
        cache.getFromCache(n);

        n = 1;
        boolean expected = true;
        boolean actual = cache.getFromCache(n);
        assertEquals(expected, actual);

        List<Integer> expectedList = new LinkedList<>(List.of(2, 1));
        List<Integer> actualList = cache.getLinkedList();
        assertEquals(expectedList.size(), actualList.size());
        int sameNumCount = 0;
        for(int i = 0; i < expectedList.size(); i++){
            if(Objects.equals(expectedList.get(i), actualList.get(i))) sameNumCount++;
        }
        assertEquals(sameNumCount, expectedList.size());
    }
    @Test
    void test_pushOutNumber_cacheMiss(){
        int n = 1;
        cache.getFromCache(n);

        n = 2;
        cache.getFromCache(n);

        n = 1;
        cache.getFromCache(n);

        n = 3;
        cache.getFromCache(n);

        n = 4;
        boolean expected = false;
        boolean actual = cache.getFromCache(n);
        assertEquals(expected, actual);

        List<Integer> expectedList = new LinkedList<>(List.of(1, 3, 4));
        List<Integer> actualList = cache.getLinkedList();
        assertEquals(expectedList.size(), actualList.size());
        int sameNumCount = 0;
        for(int i = 0; i < expectedList.size(); i++){
            if(Objects.equals(expectedList.get(i), actualList.get(i))) sameNumCount++;
        }
        assertEquals(sameNumCount, expectedList.size());
    }
}