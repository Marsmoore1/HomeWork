package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(){super();}
    public SportCar(int maxSpeed, String brand, String rank, double weigth, Driver dr, Engine eng) {
        super(brand, rank, weigth, dr, eng);
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed(){return maxSpeed;}
    public void setMaxSpeed(int maxSpeed){this.maxSpeed=maxSpeed;}
}
