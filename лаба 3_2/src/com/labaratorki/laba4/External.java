package com.labaratorki.laba4;

public class External extends undergraduate {
    String name;

    public External(String srok, int belok, int fat, String addition, int volume, String term, String name) {
        super(srok, belok, fat, addition, volume, term);
        this.name = name;
    }

    public String Manufacturer(){
        String manufacturer="БГУ";
        return manufacturer;
    }
    public void print() {

        System.out.println("Студент" + " ФМО " + Manufacturer()+ ". МЭ " + getSrok() + ". 862002 ");
    }

}