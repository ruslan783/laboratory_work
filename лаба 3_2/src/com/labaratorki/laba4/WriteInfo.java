package com.labaratorki.laba4;


public class WriteInfo {
    public static void main(String[] args) {

        Graduate_student graduate_student=new Graduate_student(" ");
        graduate_student.print();
        Schoolboy schoolboy= new Schoolboy(" ");
        schoolboy.print();
        Full_time full_time= new Full_time(" ", 1, 3, " ", 45, "термический", "Питьевой йогурт");
        full_time.print();
        External external= new External(" ", 2, 3, " ", 45, "термический", "Йогурт в стаканчике");
        external.print();
    }
}