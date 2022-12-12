package com.company;
import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
            Socket cs = new Socket("localhost", 6789);
            DataInputStream Dinput = new DataInputStream(cs.getInputStream());
            DataOutputStream Doutput = new DataOutputStream(cs.getOutputStream());

            Thread sendM = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        String msg = sc.nextLine();

                        try {
                            Doutput.writeUTF(msg);
                        }
                        catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                }
            });

            Thread readM = new Thread(new Runnable() {
                @Override
                public void run() {
                   while (true){
                       try {
                           String msg = Dinput.readUTF();
                           System.out.println(msg);
                       }
                       catch (IOException e){
                           e.printStackTrace();
                       }
                   }
                }
            });

            sendM.start();
            readM.start();
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }
}
