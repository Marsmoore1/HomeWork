package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    int loadCap;
    public Lorry(){
        super();
    }
    public Lorry (int loadCap, String brand, String rank, double weigth, Driver dr, Engine eng){
        super(brand, rank, weigth, dr, eng);
        this.loadCap=loadCap;
    }
    public void liftTheLoad(){
        System.out.println("подъем груза");
    }
//геттеры и сеттеры
    public int getLoadCap(){
        return loadCap;
    }
    public void setLoadCap(int loadCap){
        this.loadCap=loadCap;
    }
}
