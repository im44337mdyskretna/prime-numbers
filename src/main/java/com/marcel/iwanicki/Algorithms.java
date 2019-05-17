package com.marcel.iwanicki;

import com.google.common.math.BigIntegerMath;

import java.math.BigInteger;
import java.util.Random;

public class Algorithms {

    public static boolean isPrimePrimitiveFirst(long n) {

        long startTime = System.nanoTime();

        for(long i=2; i<n; i++)
            if(n % i == 0) {
                long endTime = System.nanoTime();
                long elapsedTime = endTime - startTime;
                System.out.println("\n\t\t---FINISHED--- isPrimePrimitiveFirst() in " + elapsedTime + " ns\n");
                return false;
            }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("\n\t\t---FINISHED--- isPrimePrimitiveFirst() in " + elapsedTime + " ns");

        return true;
    }

    public static boolean isPrimePrimitiveSecond(long n) {

        long startTime = System.nanoTime();

        for(long i=2; i*i<=n; i++)
            if(n % i == 0) {
                long endTime = System.nanoTime();
                long elapsedTime = endTime - startTime;
                System.out.println("\n\t\t---FINISHED--- isPrimePrimitiveFirst() in " + elapsedTime + " ns");
                return false;
            }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("\n\t\t---FINISHED--- isPrimePrimitiveFirst() in " + elapsedTime + " ns");

        return true;
    }

    public static boolean isPrimeWilson(long n) {
        long startTime = System.nanoTime();

        if(n <= 3) {
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;
            System.out.println("\n\t\t---FINISHED--- isPrimeWilson() in " + elapsedTime + " ns");
            return true;
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("\n\t\t---FINISHED--- isPrimeWilson() in " + elapsedTime + " ns");

        return (n > 1) && ((BigIntegerMath.factorial((int)n-1).add(BigInteger.ONE).mod(BigInteger.valueOf(n))).equals(BigInteger.ZERO));
    }

    public static long moduloPower(long a, long b, long c) {

        long result = 1;
        for (long i = 0; i < b; i++) {

            result *= a;
            result %= c;
        }

        return result % c;
    }

    public static boolean isPrimeFermat(long n, long k) {

        long startTime = System.nanoTime();

        //PRZYPADKI PODSTAWOWE
        if (n <= 2) {
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;
            System.out.println("\n\t\t---FINISHED--- isPrimeFermat() in " + elapsedTime + " ns");
            return true;
        }

        if (n % 2 == 0) {
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;
            System.out.println("\n\t\t---FINISHED--- isPrimeFermat() in " + elapsedTime + " ns");
            return false;
        }


        //MALE TWIERDZENIE FERMATA
        Random random = new Random();
        for (int i = 0; i < k; i++) {

            long r = Math.abs(random.nextLong());

            long a = r % (n - 1) + 1;

            if (moduloPower(a, n - 1, n) != 1) {
                long endTime = System.nanoTime();
                long elapsedTime = endTime - startTime;
                System.out.println("\n\t\t---FINISHED--- isPrimeFermat() in " + elapsedTime + " ns");
                return false;
            }

        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("\n\t\t---FINISHED--- isPrimeFermat() in " + elapsedTime + " ns");
        return true;
    }

}
