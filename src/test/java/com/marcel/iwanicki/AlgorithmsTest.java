package com.marcel.iwanicki;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class AlgorithmsTest {

    private static final String FILE_PATH = "/home/marcel/IdeaProjects/primenumbers/src/main/resources/primes.txt";
    private static final Long MAX_VALUE = 10000L;

    @Test
    public void isPrimitiveFirstTest() {

        File file = new File(FILE_PATH);

        try {
            Scanner scanner = new Scanner(file);

            for(long i=1; i<=MAX_VALUE; i++) {
                long p = scanner.nextInt();
                boolean result = Algorithms.isPrimePrimitiveFirst(p);
                boolean expected = true;

                assertEquals(expected, result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void isPrimitiveSecondTest() {
        File file = new File(FILE_PATH);

        try {
            Scanner scanner = new Scanner(file);

            for(long i=1; i<=MAX_VALUE; i++) {
                long p = scanner.nextInt();
                boolean result = Algorithms.isPrimePrimitiveSecond(p);
                boolean expected = true;

                assertEquals(expected, result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void isPrimeWilsonTest() {
        File file = new File(FILE_PATH);

        try {
            Scanner scanner = new Scanner(file);

            for(long i=1; i<=MAX_VALUE; i++) {
                long p = scanner.nextInt();
                boolean result = Algorithms.isPrimeWilson(p);
                boolean expected = true;

                assertEquals(expected, result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void isPrimeFermatTest() {
        File file = new File(FILE_PATH);

        try {
            Scanner scanner = new Scanner(file);

            for(long i=1; i<=MAX_VALUE; i++) {
                long p = scanner.nextInt();
                boolean result = Algorithms.isPrimeFermat(p, 1);
                boolean expected = true;

                assertEquals(expected, result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
