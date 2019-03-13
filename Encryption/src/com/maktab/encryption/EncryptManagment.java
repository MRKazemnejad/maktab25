package com.maktab.encryption;

import java.util.Scanner;

public class EncryptManagment {
    public static void main(String[] args) {
        Encryption en = new Encryption();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your message:");
        String message=scanner.nextLine();
        en.getMessage(message);
        System.out.println("Enter your EncryptNumber:");
        int encryptNumber=scanner.nextInt();
        en.getCode(encryptNumber);
        en.printCode();


    }
}
