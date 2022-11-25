package org.magdy;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        // how to make factorial function with class
//        Factorial factorial=new Factorial();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("inter number");
//        int number = scanner.nextInt();
//        factorial.fact(number);


        //===================================================================
//
//        // here we can have random with class Random
//        Random random=new Random();
//        int numb= random.nextInt();
//        System.out.println("random number = "+numb);
//
//        double numb2=random.nextDouble();
//        System.out.println("random number = "+numb2);
//
//
//        // here we can have ThreadLoca
//        double c = ThreadLocalRandom.current().nextDouble();
//        System.out.println("random number = "+c);



        //========================================================================

        //How to Print Pattern in Java
        int row = 6;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }


    }
}