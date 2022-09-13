package com.company;

public class UsePackage {
    InsuredPackage ip1 = new InsuredPackage(103, 'A');
    InsuredPackage ip2 = new InsuredPackage(0.4, 'T');
    InsuredPackage ip3 = new InsuredPackage(50, 'M');

    public void displayDet(){
        System.out.println("Package 1:");
        ip1.display();
        System.out.println("\nPackage 2:");
        ip2.display();
        System.out.println("\nPackage 3:");
        ip3.display();
    }
}
