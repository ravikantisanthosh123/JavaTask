package com.stackroute.unittest;

import java.util.Scanner;
import java.lang.String;


        public class ConsonentVowel
            {
                public static void main(String args[]) {
                    Scanner sc = new Scanner(System.in);
                    consonent con=new consonent();
                    String str=sc.nextLine();
                    int ch= con.consonent2(str);

                    switch(ch)
                    {
                        case 1:System.out.print("Vowel ");
                        break;
                        case 2:System.out.print("Consonant ");
                        break;
                    }
                }
            }


