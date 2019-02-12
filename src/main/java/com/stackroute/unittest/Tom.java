package com.stackroute.unittest;

public class Tom
{
        public String tomFunction(int n)
        {
            String temp="";
            if((n%2!=0) && (n>20 && n<30) )
               temp="tom";
                //System.out.println("Tom");
            else if((n%2==0) && (n>20 && n<30) )
                //System.out.println("Jerry");
                temp="Jerry";

            return temp;
         }


}
