package com.maktab.encryption;

public class Encryption {
    private String message;
    private int encryptNumber;
    private char[] convert;
    private int[] encryptConvert;



    public void getMessage(String message) {
        this.message = message;
        convert=message.toCharArray();
        encryptConvert=new int[message.length()];
    }

    public void getCode(int encryptNumber) {
        this.encryptNumber = encryptNumber;
    }

    private int encrypt(char ch, int encryptNumber) {
        int convertChar = (int) ch;
        convertChar = convertChar + encryptNumber;
        return convertChar;
    }

     public void encryptAll(char[] ch){

        for(int i=0;i<ch.length;i++){
            encryptConvert[i]=encrypt(ch[i],encryptNumber);
        }

    }

    public void printCode() {
        encryptAll(convert);
        for (int s : encryptConvert) {
            if(s==(32+encryptNumber)){
                s=s-encryptNumber;
            }
            System.out.print((char)s);
        }
    }



}
