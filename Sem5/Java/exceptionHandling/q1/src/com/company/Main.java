package com.company;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int seats[] = new int[100];
            System.out.print("Enter the number of seats to be booked: \n");
            int n = sc.nextInt();
            int i;
            try{
                for (i = 0; i < n; i++) {
                    System.out.print("Enter the seat number " + (i + 1));
                    int x = sc.nextInt();
                    seats[x] = 1;
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.print("java.lang.ArrayIndexOutOfBoundsException: 100");
            }
    }
}

