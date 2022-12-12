package com.company;
import java.lang.*;
import java.util.*;

//interface implementation
interface flight{
    void services();
}

//abstract class implementation
abstract class Person{
    String firstName, lastName, departure, arrival;
    int age;
    float fare;

    Person(){
        this.firstName = "M";
        this.lastName = "S";
        this.departure = "Chennai";
        this.arrival = "Seoul";
        this.fare = 0;
        this.age = 50;
    }

    Person(String fn, String ln, String d, String a, int n){
        this.firstName = fn;
        this.lastName = ln;
        this.departure = d;
        this.arrival = a;
        this.age = n;
    }

    abstract public void bookFlightTicket();

    @Override
    public String toString(){
        return "Name: " + firstName + ' ' + lastName + "\t\t Age: " + age + "\n Departure: " + departure + "\t\t Arrival: " + arrival;
    }
}

class SeniorCitizen extends Person{
    boolean wheelchair;

    public void bookFlightTicket(){

    }
}

class Kid extends Person{
    boolean accompanied;

    public void bookFlightTicket(){

    }
}

class Adult extends Person{
    boolean vaccincated;

    public void bookFlightTicket(){

    }
}

class Pilot{
    String firstName, lastName, toPlace, fromPlace;
    int age;

}

class AirHost{
    String firstName, lastName, toPlace, fromPlace;
    int age;

}

class DomesticFlight implements flight{
    public void services(){
        System.out.print("We provide free breakfast. ");
    }
}

public class Main {
    public static void main(String[] args){
        System.out.print("Hi");
    }
}
