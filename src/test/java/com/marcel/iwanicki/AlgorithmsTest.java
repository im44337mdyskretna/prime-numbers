package com.marcel.iwanicki;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class AlgorithmsTest {

    private static final String PRIMES_PATH = "src/main/resources/primes.txt";
    private static final String COMPOSITES_PATH = "src/main/resources/composites.txt";
    private static final Long MAX_VALUE = 10000L;

    @Test
    public void isPrimitiveFirstTestPrimes() {

        File file = new File(PRIMES_PATH);

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
    public void isPrimitiveFirstTestComposites() {

        File file = new File(COMPOSITES_PATH);

        try {
            Scanner scanner = new Scanner(file);

            for(long i=1; i<=MAX_VALUE/2; i++) {
                long p = scanner.nextInt();
                boolean result = Algorithms.isPrimePrimitiveFirst(p);
                boolean expected = false;

                assertEquals(expected, result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void isPrimitiveSecondTestPrimes() {
        File file = new File(PRIMES_PATH);

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
    public void isPrimitiveSecondTestComposites() {
        File file = new File(COMPOSITES_PATH);

        try {
            Scanner scanner = new Scanner(file);

            for(long i=1; i<=MAX_VALUE/2; i++) {
                long p = scanner.nextInt();
                boolean result = Algorithms.isPrimePrimitiveSecond(p);
                boolean expected = false;

                assertEquals(expected, result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void isPrimeWilsonTestPrimes() {
        File file = new File(PRIMES_PATH);

        try {
            Scanner scanner = new Scanner(file);

            for(long i=1; i<=MAX_VALUE/2; i++) {
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
    public void isPrimeWilsonTestComposites() {
        File file = new File(COMPOSITES_PATH);

        try {
            Scanner scanner = new Scanner(file);

            for(long i=1; i<=MAX_VALUE/2; i++) {
                long p = scanner.nextInt();
                boolean result = Algorithms.isPrimeWilson(p);
                boolean expected = false;

                assertEquals(expected, result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void isPrimeFermatTestPrimes() {
        File file = new File(PRIMES_PATH);

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

    @Test
    public void isPrimeFermatTestComposites() {
        File file = new File(COMPOSITES_PATH);

        try {
            Scanner scanner = new Scanner(file);

            for(long i=1; i<=MAX_VALUE/2; i++) {
                long p = scanner.nextInt();
                boolean result = Algorithms.isPrimeFermat(p, 10);
                boolean expected = false;

                assertEquals(expected, result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
