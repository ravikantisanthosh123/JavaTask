    package com.stackroute.unittest;

    public class consonent {

        public int consonent2(String str) {
            for (int i = 0; i < str.length(); i++)
            {
                if ((str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') ||
                        (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')) {
                    //System.out.print("Vowel ");
                    return 1;
                } else
                //System.out.print("Consonent ");
                {
                    return 2;
                }
            }
            return 0;
        }
    }

