package com.labaratorki.laba4;

public class Graduate_student implements Student, Object{
    private String srok;
    private int belok;
    private int fat;
    private int volume, amount;

    public Graduate_student(String srok) {
        this.srok = srok;
    }




    @Override
    public void print() {
        System.out.println("\nСоветский стиль 1950/1960 годов " +  ". Научный руководитель: Чишуйкин А.О. " + srok);


    }

    @Override
    public String Manufacturer() {
        return null;
    }
}