package com.marcel.iwanicki;

import com.google.common.math.BigIntegerMath;

import java.math.BigInteger;
import java.util.Random;

public class Algorithms {

    /*
        Metoda prymitywna (sprawdzanie od 1 do n-1)
     */
    public static boolean isPrimePrimitiveFirst(long n) {

        long startTime = System.nanoTime();

        if(n == 1) {
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;
            System.out.println("\n\t\t---FINISHED--- isPrimePrimitiveFirst() in " + elapsedTime + " ns\n");
            return false;
        }

        // Iteruj od 2 do n-1 i sprawdz: czy n dzieli sie przez i?
        // Jesli tak to n nie jest pierwsza
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

    /*
        Metoda prymitywna (sprawdzanie od 1 do sqrt(n))
    */
    public static boolean isPrimePrimitiveSecond(long n) {

        long startTime = System.nanoTime();

        if(n == 1) {
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;
            System.out.println("\n\t\t---FINISHED--- isPrimePrimitiveSecond() in " + elapsedTime + " ns\n");
            return false;
        }

        // Iteruj od 2 do sqrt(n) i sprawdz: czy n dzieli sie przez i?
        // Jesli tak to n nie jest pierwsza
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

        if(n == 1) {
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;
            System.out.println("\n\t\t---FINISHED--- isPrimeWilson() in " + elapsedTime + " ns\n");
            return false;
        }

        if(n <= 3) {
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;
            System.out.println("\n\t\t---FINISHED--- isPrimeWilson() in " + elapsedTime + " ns");
            return true;
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("\n\t\t---FINISHED--- isPrimeWilson() in " + elapsedTime + " ns");

        // TWIERDZENIE WILSONA MOWI: jesli (n > 1) i (n | ((n-1)! + 1)) to liczba jest pierwsza
        return (n > 1) && ((BigIntegerMath.factorial((int)n-1).add(BigInteger.ONE).mod(BigInteger.valueOf(n))).equals(BigInteger.ZERO));
    }

    /*
        Potegowanie modulo a^b mod c
     */
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
        if(n == 1) {
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;
            System.out.println("\n\t\t---FINISHED--- isPrimeFermat() in " + elapsedTime + " ns\n");
            return false;
        }

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


        //OWROCONE MALE TWIERDZENIE FERMATA
        Random random = new Random();
        //Wykonaj k sprawdzen - im wiecej losowan tym pewniejszy wynik
        for (int i = 0; i < k; i++) {

            long r = Math.abs(random.nextLong());

            // a = r mod (n-1) + 1
            long a = r % (n - 1) + 1;

            // jesli a^(n-1) [mod n] != 1 , to n nie jest pierwsza
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
