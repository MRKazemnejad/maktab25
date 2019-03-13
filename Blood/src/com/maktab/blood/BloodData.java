package com.maktab.blood;
public class BloodData {
    private String bloodType;
    private char rhFactor;

    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = '+';
    }
//Constructor with checking blood type and RH factor
    public BloodData(String bloodType, char rhFactor) {
        if (bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("O") || bloodType.equals("AB")){
            this.bloodType=bloodType;
        }
        else{
            System.out.println("Wrong blood type !!!");
        }
        if(rhFactor=='+' || rhFactor=='-'){
            this.rhFactor=rhFactor;
        }
        else{
            System.out.println("Wrong RH factro !!!");
        }

    }

    public void setBloodType(String bloodType) {
       this.bloodType = bloodType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setRhFactor(char rhFactor) {
        this.rhFactor = rhFactor;
    }

    public char getRhFactor() {
        return rhFactor;
    }

}
