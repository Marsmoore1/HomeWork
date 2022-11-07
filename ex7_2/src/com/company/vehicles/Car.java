package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String brand; //марка
    private String rank; //класс
    private double weigth;//вес
    private Driver dr;
    private Engine eng;

    public Car (){};
    public Car (String brand, String rank, double weigth, Driver dr, Engine eng){
        this.brand=brand;
        this.rank=rank;
        this.weigth=weigth;
        this.dr=new Driver();
        this.eng=new Engine();
    }

    public void start(){
        System.out.println("поехали ");
    }
    public void stop(){
        System.out.println("останавливаемся ");
    }
    public void turnRigth(){
        System.out.println("поворот направо ");
    }
    public void turnLeft(){
        System.out.println("поворот налево ");
    }
//геттеры и сеттеры
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getRank(){
        return rank;
    }
    public void setRank(String rank){
        this.rank=rank;
    }
    public double getWeigth(){
        return weigth;
    }
    public void setWeigth(double weigth){
        this.weigth=weigth;
    }
}
