package com.company;
import java.lang.*;
import java.util.*;

class Package{
    public double weight,shippingCost;
    public char shippingMethod;

    Package(){
        weight = 0;
        shippingCost = 0;
        shippingMethod = 'T';
    }

    Package(double w, char type){
        this.weight = w;
        this.shippingMethod = type;
        this.shippingCost = calculateCost();
    }

    public double calculateCost(){
        switch (this.shippingMethod) {
            case 'A':
            case 'a':
                if (this.weight >= 1 && this.weight <= 8) {
                    return 2;
                }
                else if (this.weight >= 9 && this.weight <= 16) {
                    return 3;
                }
                else{
                    return 4.5;
                }
            case 'T':
            case 't':
                if (this.weight >= 1 && this.weight <= 8) {
                    return 1.5;
                }
                else if (this.weight >= 9 && this.weight <= 16) {
                    return 2.35;
                }
                else{
                    return 3.25;
                }
            case 'M':
            case 'm':
                if (this.weight >= 1 && this.weight <= 8) {
                    return 0.50;
                }
                else if (this.weight >= 9 && this.weight <= 16) {
                    return 1.50;
                }
                else{
                    return 2.15;
                }
        }
        return 0;
    }

    String method(){
        switch (this.shippingMethod) {
            case 'A':
            case 'a':
                return "Air";
            case 'T':
            case 't':
                return "Truck";
            case 'M':
            case 'm':
                return "Mail";
        }
        return "Not Assigned";
    }

    public void display(){
        System.out.print("Weight: " + this.weight + " ounces\n");
        System.out.print("Shipping Method: " + this.method() + " \n");
        System.out.print("Shipping Cost: " + this.shippingCost + " \n");
    }
}