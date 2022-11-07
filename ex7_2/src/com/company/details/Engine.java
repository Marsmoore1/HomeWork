package com.company.details;

public class Engine {
    private int power;
    private String manuf; //manufacturer

    public Engine (){};
    public Engine (int power, String manuf){
        this.power=power;
        this.manuf=manuf;
    }
    public String engineInfo(){
        return power+" "+manuf;
    }

    public int getPower(){
        return power;
    }
    public void setPower(int power){
        this.power=power;
    }
    public String getManuf(){
        return manuf;
    }
    public void setManuf(String manuf){
        this.manuf=manuf;
    }
}
