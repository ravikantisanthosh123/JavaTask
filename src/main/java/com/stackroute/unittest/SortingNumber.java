package com.stackroute.unittest;
import java.util.Scanner;
public class SortingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        char[] Array = number.toCharArray();
        int sum = 0,even;
        for(int i=0; i  <Array.length; i++){
            even = Integer.parseInt(String.valueOf(Array[i]));
            if(even%2 == 0){
                sum = sum + even;
            }
        }
        for(int i=0; i<Array.length; i++){
            for (int j=i+1; j<Array.length; j++){
                if(Array[i] > Array[j] ){
                    char temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }
        System.out.print("Sorted Array in non-increasing order: ");
        System.out.println(Array);
        if(sum > 15)
            System.out.println("Sum of even numbers: "+sum+"\n True");
        else
            System.out.println("Sum of even numbers: "+sum+"\n False");
    }
}