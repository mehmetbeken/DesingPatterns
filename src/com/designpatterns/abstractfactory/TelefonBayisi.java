package com.designpatterns.abstractfactory;

import com.designpatterns.factory.Telefon;

public class TelefonBayisi {

    public static void main(String[] args) {
        S8Fabrikası s8Fabrikası = new S8Fabrikası();
        Telefon s8 = s8Fabrikası.getTelefon("s8", "2600", 4, 7);

        Note8Fabrikası note8Fabrikası = new Note8Fabrikası();
        Telefon note8 = note8Fabrikası.getTelefon("note8", "3000", 5, 8);


        System.out.println(s8);
        System.out.println(note8);
    }
}
