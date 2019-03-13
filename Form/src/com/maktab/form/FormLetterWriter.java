package com.maktab.form;

import java.util.Scanner;

public class FormLetterWriter {
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
    public void displaySalutation(String lastName){
        System.out.println("Dear Mr "+lastName);
        System.out.println("\n\n\n");
        System.out.println("Thank you for your recent order.");

    }
    public void displaySalutation(String firstName,String lastName){
        System.out.println("greeting Dear "+firstName+" "+lastName);
        System.out.println("\n\n\n");
        System.out.println("Thank you for your recent order.");
        System.out.println("*********************************\n");
    }
}
