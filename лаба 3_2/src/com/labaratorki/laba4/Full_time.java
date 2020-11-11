package com.labaratorki.laba4;


public class Full_time extends undergraduate {
    String name;

    public Full_time(String srok, int belok, int fat, String addition, int volume, String term, String name) {
        super(srok, belok, fat, addition, volume, term);
        this.name = name;
    }

    public String Manufacturer(){
        String manufacturer="БГУИР";
        return manufacturer;
    }
    public void print() {

        System.out.println("Студент" + " ИЭФ " + Manufacturer()+ ". ЭМ " + getSrok() + ". 974001 ");
    }
}