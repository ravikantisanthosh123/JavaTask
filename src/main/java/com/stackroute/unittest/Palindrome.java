
package com.stackroute.unittest;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        long x=scan.nextLong();
        String n=Long.toString(x);
        char[] a= n.toCharArray();
        char[] r=new char[a.length];
        for(int i=0;i<a.length-1;i++)
        {
            r[i]=a[a.length-i-1];
        }
        r[a.length-1]=a[0];
        int sum=0;
        if(Arrays.equals(a, r))
        {
            System.out.println("palindrome");
            for(int i=0;i<a.length;i++)
            {
                if(a[i]%2==0)
                {
                    sum+=(a[i]-48);
                }
            }
            System.out.println(sum);
            if(sum>25)
            {
                System.out.println("success");
            }
            else {
                System.out.println("Failure");
            }

        }

        else
        {
            System.out.println("not a palindrome");
        }
    }
}





