package com.company;
import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws DoctorExceptions {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.");
        int n = sc.nextInt();
        int i;

        Patient pat[] = new Patient[n];
        Doctor doc[] = new Doctor[n];
        Nurse nur[] = new Nurse[n];
        Receptionist r[] = new Receptionist[1];

        Thread tr[] = new Thread[1]; //receptionist thread

        Random rand = new Random();
        for (i = 0; i < n; i++) {
            pat[i].p = (int) Math.floor(Math.random() * n + 1);
            int x = (int) Math.floor(Math.random() * n + 1);
            doc[i].d = x;
            nur[i].n = x;
        }

        //thread creations
        try {
            for (i = 0; i < n; i++) {
                Thread pt[] = new Thread[i];
                Thread pd[] = new Thread[i];
                Thread pn[] = new Thread[i];
                tr[0].start();
                pt[i].start();
                pd[i].start();

                tr[0].join();
                pt[i].join();
                pd[i].join();
                pn[i].join();

            }

            //printing statements
        }
        catch (Exception e){
            e.printStackTrace();
        }

        //if else throw new DoctorExceptions

    }

}

class Receptionist extends Thread{
    public int r;

    Receptionist(int r){
        this.r = r;
    }

    //function that should register a patient, waiting room
    public void reception(){

    }
}

class Nurse extends Thread{
    public int n;

    Nurse(int n){
        this.n=n;
    }
}
class Doctor extends Thread{
    public int d;

    Doctor(int d){
        this.d = d;
    }

    //System.out.print("Doctor" + d + "listens to symptoms from patient");

    //throw error if doctor is busy
}

class Patient extends Thread{
    public int p;

    Patient(int p){
        this.p = p;
    }

    //synchronized() {

    //}

    //if true, System.out.print("Patient" + p + "enters waiting room, waits for receptionist"); else System.out.print("Patient" + p + "leaves receptionist, waits in waiting room");
}

class DoctorExceptions extends Exception{
     DoctorExceptions(String message){
        super(message);
    }
}







































