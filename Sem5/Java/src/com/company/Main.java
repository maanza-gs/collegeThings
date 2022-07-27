package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount of mass:");
        float a = s.nextFloat();
        System.out.print("Enter the age in years:");
        float t = s.nextInt();
        double h = 0;
        for (float i = t; i<=t+10; i++)
        {
            h = Math.round(Math.pow(a*i,0.25));
            System.out.println("At age "+i+" years, " +
                    "the approximate height of the tree is " + h);
        }
    }
}
