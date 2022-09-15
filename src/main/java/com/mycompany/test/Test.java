/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.test;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------");
        System.out.println("| Kalkulator sederhana |");
        System.out.println("------------------------");
        System.out.println("| List Command:        |");
        System.out.println("| (+)tambah            |");
        System.out.println("| (-)kurang            |");
        System.out.println("| (*)kali              |");
        System.out.println("| (/)bagi              |");
        System.out.println("| (c)clear             |");
        System.out.println("| (e)exit              |");
        System.out.println("-----------------------");

        boolean empty = true;
        float result = 0;

        label:
        do {

            if (empty) {
                System.out.print("Enter number: ");
                float x = scanner.nextFloat();
                result = x;
                empty = false;
            } else {
                System.out.println("-----------------------");
                System.out.println("Result: " + result);
                System.out.println("-----------------------");
            }

            System.out.print("\nEnter operator: ");
            String command = scanner.next();

            System.out.print("\nEnter number: ");
            float y = scanner.nextFloat();
            switch (command) {
                case "+":
                    result += y;
                    break;
                case "-":
                    result -= y;
                    break;
                case "*":
                    result *= y;
                    break;
                case "/":
                    result /= y;
                    break;
                case "c":
                    result = 0;
                    empty = true;
                    System.out.println("-----------------------");
                    System.out.println("Clear");
                    break;
                case "e":
                    System.out.println("-----------------------");
                    System.out.println("You exiting program...");
                    break label;
                default:
                    result = 0;
                    empty = true;
                    System.out.println("-----------------------");
                    System.out.println("Invalid Command!");
                    break;
            }
        } while (true);
    }
}
