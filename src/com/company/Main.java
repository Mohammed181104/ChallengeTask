package com.company;

import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int randNum = random.nextInt(20) + 1;
        System.out.println(randNum);
        System.out.println("Guess a number from 1 to 20");
        long startTime = System.currentTimeMillis()/1000;
        int guess = input.nextInt();
        int counter = 1;
        while (guess != randNum){
            counter ++;
            System.out.println("Try again:");
            int diff1 = randNum - guess;
            guess = input.nextInt();
            int diff2 = randNum - guess;
            if (guess != randNum) {
                if (diff1 < 0) {
                    diff1 = diff1 * -1;
                }
                if (diff2 < 0) {
                    diff2 = diff2 * -1;
                }
                if (diff2 < diff1) {
                    System.out.println("Warmer");
                } else if (diff2 > diff1) {
                    System.out.println("Colder");
                }
            }


        }
        long endTime = System.currentTimeMillis()/1000;


        System.out.println("Correct! It took you " + counter + " tries.");
        System.out.println("It took you " + (endTime - startTime) + " seconds");



    }
}
