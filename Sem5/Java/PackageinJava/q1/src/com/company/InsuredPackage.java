package com.company;

public class InsuredPackage extends Package {
    InsuredPackage(double w, char t){
        super(w,t);
        addCost();
    }
    public void addCost(){
        if(super.shippingCost>=0 && super.shippingCost<=1)
            super.shippingCost+=2.45;
        else if(super.shippingCost>=1.01 && super.shippingCost<=3)
            super.shippingCost+=3.95;
        else
            super.shippingCost+=5.55;
    }
}
