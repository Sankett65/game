package com.snake_ladder;

import java.util.Random;
import java.util.Scanner;

public class practice {
  public static final  int TARGET=100;
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your name ");
       String m=sc.nextLine();
       System.out.println("Lets Start the Snake & Ladder game");
       System.out.println();
       Random r = new Random();
        Random f=new Random();
        //System.out.println(check);
        int s = 0;
        int count =1;



        for (int i = 1; i < 35; i++) {
            int d = r.nextInt(1, 7);
            System.out.println("Current value is "+s);
            count++;
            if (s==TARGET) {
                s=s;
                break;
            }else if (s>TARGET){
                s=s-d;
                continue;
            } else if (s==99) {
                d=1;

            }

            System.out.println("Rolling the dice :"+d);
                if (s<TARGET) {
                    s = s + d;
                }else if (s==TARGET){
                    break;
                }


                int check=f.nextInt(3);


            if (s ==TARGET ) {
                break;
            }
              else if (check==0 ) {
                        if (s==TARGET)
                            break;
                      System.out.println("You got nothing you can continue");
                      System.out.println("Current value is " + s);
                  }

                else if (check==1 ) {

                         if (s==TARGET)
                             break;
                    System.out.println("You hve got a ladder and you have to increase you value by  " + d);
                    s = s + d;
                    System.out.println("Value after taking Ladder  " + s);
                }

                else {

                        if (s==TARGET)
                            break;
                    System.out.println("You have got a snake and you have to decrease you value by  " + d);
                    s = s - d;
                    System.out.println("After you get snake you current value is " + s);
                }
                if (s>TARGET){
                    s=s-d;
                    System.out.println("Current Score "+s);
                    continue;
                }



        }


        if (count>=35 && s<TARGET){
            System.out.println("\nComputer has Won the game");
        }else {
            System.out.println("\nYOU HAVE WON!!!" );
        }

        System.out.println("\nThe score of s: " + s);
        System.out.println("try taking  "+count);

    }
}
