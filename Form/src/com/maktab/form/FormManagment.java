package com.maktab.form;

import java.util.Scanner;

public class FormManagment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        FormLetterWriter form=new FormLetterWriter();
        form.setFirstName("Ali");
        form.setLastName("Ahmadi");
        form.displaySalutation(form.getFirstName(),form.getLastName());
        form.displaySalutation(form.getFirstName());
    }
}
