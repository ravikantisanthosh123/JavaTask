package com.stackroute.unittest;
import java.util.Scanner;
public class StringRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String userInput = sc.nextLine();
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        int i=0;
        System.out.print(userInput);
        while(i < num){
            System.out.print(userInput.substring(userInput.length() - num));
            i++;
        }

    }
}