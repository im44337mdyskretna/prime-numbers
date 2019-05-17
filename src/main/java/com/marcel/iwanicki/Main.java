package com.marcel.iwanicki;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Czesc pierwsza: ");
        System.out.println("\nWybierz metode wyznaczania czy liczba jest pierwsza: ");
        System.out.println("[1]: Prymitywna do n-1");
        System.out.println("[2]: Prymitywna do sqrt(n)");
        System.out.println("[3]: Wilsona");
        System.out.println("[4]: Fermata\n");

        System.out.print("Podaj opcje: ");
        int option = scanner.nextInt();

        System.out.print("Podaj liczbe do sprawdzenia: ");
        long input = scanner.nextLong();

        boolean isPrime = false;
        switch (option) {
            case 1:
                isPrime = Algorithms.isPrimePrimitiveFirst(input);
                break;
            case 2:
                isPrime = Algorithms.isPrimePrimitiveSecond(input);
                break;
            case 3:
                isPrime = Algorithms.isPrimeWilson(input);
                break;
            case 4: {
                System.out.print("Podaj k: ");
                long k = scanner.nextLong();
                isPrime = Algorithms.isPrimeFermat(input, k);
                break;
            }
        }

        System.out.println(isPrime ? "\nLiczba JEST pierwsza" : "\nLiczba NIE JEST pierwsza");

        scanner.close();
    }
}
