import jdk.dynalink.StandardNamespace;

import java.util.Random;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int x = 20;
        int number = scanner.nextInt();
        if (number == x) {
            System.out.println("znaleziono prawidlowa liczbe");

        } else {
            System.out.println("liczba jest nieprawidlowa");
            if (number > x) {
                System.out.println("szukana liczba jest mniejsza");
            }
        }

            if (number < x) {
                System.out.println("szukana liczba jest wieksza");
        }
    }
}

