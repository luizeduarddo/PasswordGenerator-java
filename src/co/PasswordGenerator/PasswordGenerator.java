package co.PasswordGenerator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args){
        Random generate = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of numbers that you want: ");

        String input_user = scanner.nextLine();

        System.out.println("Your random numbers are: ");
        for(int i =0; i < Integer.parseInt(input_user); ){
            int number = generate.nextInt(90);
            System.out.println(number);
            i++;
        }
    }
}