package com.company.professions;

public class Driver {
    private String name;
    private String surname;
    private String pat; //от англ. patronymic - отчество
    private int exp; //стаж вождения

    public Driver (){};
    public Driver (String name, String surname, String pat, int exp) {
        this.name=name;
        this.surname=surname;
        this.pat=pat;
        this.exp=exp;
    }



//геттеры и сеттеры
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getPat(){
        return pat;
    }
    public void setPat(String pat){
        this.pat=pat;
    }
    public int getExp(){
        return exp;
    }
    public void setExp(int exp){
        this.exp=exp;
    }
}
