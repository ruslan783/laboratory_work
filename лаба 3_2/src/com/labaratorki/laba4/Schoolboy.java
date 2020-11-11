package com.labaratorki.laba4;


public class Schoolboy implements Student, Object{
    private String srok;
    private int belok;
    private int fat;
    private int massa;
    private String zernistost;

    public Schoolboy(String srok) {
        this.srok = srok;
    }


    @Override
    public String Manufacturer() {
        String manufacturer="Гимназия №23";
        return manufacturer;
    }


    @Override
    public void print() {
        System.out.println("Школьник " + Manufacturer() + srok + ". 11 " + ". А ");
    }
}