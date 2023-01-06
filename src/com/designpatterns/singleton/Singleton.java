package com.designpatterns.singleton;

public class Singleton {

    private static Singleton singleton;

    private static int sayi = 0;



    private Singleton(){
        System.out.println("Ben oluştum");
    }

    //Static metotlar içinde sadece statik değişkenler kullanılır
    //Statik değişkenler metotlar uygulama ayağa kaldırılınca oluştulur
    public static Singleton getSingleton(){

        //Aynı andaki threadlerde çok yavaşlık olmaması için nullık kontrolü yapıldı
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        sayi++;
        System.out.println(sayi);
        //Nesne bir kere oluştu
        return singleton;
    }
}
