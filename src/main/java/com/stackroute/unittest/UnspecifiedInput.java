package com.stackroute.unittest;
import java.util.Scanner;

public class UnspecifiedInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        int sum = 0;
        String number = "";
        for(int i=0;i<userInput.length(); i++){
            if(userInput.charAt(i) == ' ' && number != ""){
                sum = sum + Integer.parseInt(number);
                number = "";
            }
            else if(userInput.charAt(i) >= 48 && userInput.charAt(i) <= 57){
                number = number + userInput.charAt(i);
            }
            else
                System.err.println(userInput.charAt(i) + " is not a number!");

            if(i == (userInput.length() - 1) && number != "")
                sum = sum + Integer.parseInt(number);
        }
        System.out.println("Sum of "+ userInput +" is " +sum);
    }
}