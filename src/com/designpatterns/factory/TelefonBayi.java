package com.designpatterns.factory;

public class TelefonBayi{

    public static void main(String[] args) {

       Telefon s8 = TelefonFabrikas─▒.getTelefon("S8","2600",4,7);
       Telefon note8 = TelefonFabrikas─▒.getTelefon("Note8", "3000",5,8);

        System.out.println(s8);
        System.out.println(note8);
    }
}
