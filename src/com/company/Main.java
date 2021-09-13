package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int randNum = random.nextInt(20) + 1;
        System.out.println("Guess a number from 1 to 20");
        int guess = input.nextInt();
        int counter = 1;

        while(guess != randNum){
            if (guess - randNum == 1 || -1){
                System.out.println("WARM!!!");
            }
            System.out.println("Wrong, try again");
            guess = input.nextInt();
            counter ++;


        }

        if (guess == randNum){
            System.out.println("Correct! It took you " + counter + " tries.");
        }

    }
}
