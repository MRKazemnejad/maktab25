package com.maktab.Patient;
import com.maktab.blood.BloodData;

public class Patient {
    private int ID;
    private int age;
    BloodData bloodData =new BloodData();;

    public Patient(){

       this.ID=0;
       this.age=0;
    }
    //constructor with 4 value
    public  Patient(int ID,int age,String bloodtype,char rhfactor){
        this.ID=ID;
        this.age=age;
        bloodData.setBloodType(bloodtype);
        bloodData.setRhFactor(rhfactor);
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }


}
