package com.maktab.form;

import java.util.Scanner;

public class FormManagment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        FormLetterWriter form=new FormLetterWriter();
        System.out.println("Enter your first name: ");
        String firstName=scanner.nextLine();
        form.setFirstName(firstName);
        System.out.println("Enter your last name: ");
        String lastName=scanner.nextLine();
        form.setLastName(lastName);
        form.displaySalutation(form.getFirstName());//display first name with Dear
        form.displaySalutation(form.getFirstName(),form.getLastName());//display first name and last name with greeting Dear

    }//end of method main
}
