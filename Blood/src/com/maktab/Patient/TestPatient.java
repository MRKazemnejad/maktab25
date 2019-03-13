package com.maktab.Patient;

import com.maktab.blood.BloodData;

import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Patient patient=new Patient();
        System.out.println("Default patient ID: "+patient.getID());
        System.out.println("Default patient age: "+patient.getAge());
        System.out.println("Default patient blood data: "+patient.getBloodData().getBloodType()+patient.getBloodData().getRhFactor());
        Patient patient1=new Patient(123,32,"A",'+');
        System.out.println("New patient ID: "+patient1.getID());
        System.out.println("New patient age: "+patient1.getAge());
        System.out.println("New patient blood data: "+patient1.getBloodData().getBloodType()+patient1.getBloodData().getRhFactor());
    }//end of method main
}
