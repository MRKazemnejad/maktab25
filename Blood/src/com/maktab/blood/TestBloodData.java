package com.maktab.blood;
public class TestBloodData {
    public static void main(String[] args) {
        BloodData bloodData=new BloodData();
        System.out.println("Default blood type: "+bloodData.getBloodType());
        System.out.println("Default RH factor: "+bloodData.getRhFactor());
        BloodData bloodData1=new BloodData("A",'-');
        System.out.println("New blood type: "+bloodData1.getBloodType());
        System.out.println("New RH factor: "+bloodData1.getRhFactor());
    }
}
