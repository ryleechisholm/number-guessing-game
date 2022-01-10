package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Random rand = new Random();
    int int_random = rand.nextInt(2);
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter number:");
    String num = myObj.nextLine();
    if (Integer.parseInt(num) == int_random) {
        System.out.println("Youre right");
    } else {
        System.out.println("Youre wrong");
    }
    System.out.print(int_random);
    }
}
