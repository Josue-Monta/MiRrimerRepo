package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        double division = (double ) number1 / number2;

        System.out.println("The result of the sum is : " + sum);
        System.out.println("The result of the subtraction is : " + subtraction);
        System.out.println("The result of the multiplication is : " + multiplication);
        System.out.println("The result of the division is: " + division);

        scanner.close();

    }
}