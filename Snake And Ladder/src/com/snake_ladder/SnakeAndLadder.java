package com.snake_ladder;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int user1=0;
        int count=0;
        Random r = new Random();


        Random s =new Random();
        int SNAKE=s.nextInt();
        int LADDER =s.nextInt();
        for (int i=1;i<35;i++) {
            int deice=r.nextInt(1,7);
            System.out.println("After rolling the die USER1 gets : "+deice);
            user1 += deice;
            System.out.println("Score is : " +user1);
            count++;

            int check = s.nextInt(3);
            if (check == 1) {
                System.out.println("You got a Snaket you have to decrease your value by " + deice);
                user1 -= deice;
                System.out.println("Current value of user1: " + user1);
            } else if (check == 2) {
                System.out.println("You got a Ladder have to increase your value by " + deice);
                user1 += deice;
                System.out.println("Current value of user1: " + user1);

            } else if (check == 3) {
                System.out.println("You got nothing ou can continue playing");
                System.out.println("Current value of user1: " + user1);
            }
            if (user1==100){
                break;
            } else if (user1>100) {
                user1=user1-deice;
            }else if (user1==99){
                deice=1;
                break;
            } else {
                continue;
            }
           // System.out.println("Current Score "+user1);

        }
        if (count>=35 ){
            System.out.println("\nComputer has Won the game");
        }else {
            System.out.println("\nYOU HAVE WON!!!" );
        }

        System.out.println("\nThe score of s: " + user1);
        System.out.println("try taking  "+count);
    }
}
