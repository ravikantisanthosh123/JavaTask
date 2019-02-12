package com.stackroute.unittest;
import java.util.Scanner;
public class ReverseString {

    String reverse(String str){
        char[] ch = str.toCharArray();
        for(int i=0; i < str.length()/2; i++){
            char tmp = ch[i];
            ch[i] = ch[ch.length - 1 - i];
            ch[ch.length -1 - i] = tmp;
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ReverseString r1 = new ReverseString();
        System.out.println(r1.reverse(str));
    }
}