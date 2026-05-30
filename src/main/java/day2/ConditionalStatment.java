package day2;

import java.util.Scanner;

public class ConditionalStatment {
    static void main(String[] args) {
        //scanner
        Scanner sc = new Scanner(System.in);
/*
        System.out.println("enter your age, please");
       int personage = sc.nextInt();
        System.out.println("your age is :" + personage);
        sc.close();
      String status =  personage >=18 ? "good to vote" : "not good to vote";
      System.out.println(" your status is : " + status);
      if (personage >=18)
          System.out.println("your are good to vote");
      else
          System.out.println("your are not good to vote");

      */
        System.out.println("enter your number");
      int num = sc.nextInt();


      if (num >= 0) {
          if (num == 0) {
              System.out.println("the number is zero");
          } else if (num % 2 == 0) {
              System.out.println("the number [" + num + "] is even ");
          } else {
              System.out.println("the number [" + num + "] is odd ");
          }
      }
      else
          System.out.println("negative numbers are not allowed");

    }
}
