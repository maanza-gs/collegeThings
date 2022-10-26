package com.company;
import java.util.ArrayList;
import java.util.Scanner;

class Stall{
    public String name,detail, type,ownerName;

    Stall(){
        name = detail = type = ownerName = "";
    }

    Stall(String n,String d,String t, String o){
        name = n;
        detail = d;
        type = t;
        ownerName = o;
    }


}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stall details");
        int n = sc.nextInt();
        ArrayList<ArrayList<Stall>> stalls = new ArrayList<ArrayList<Stall>>(n);
        ArrayList<>

    }
}
