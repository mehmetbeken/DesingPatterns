package com.designpatterns.abstractfactory;

import com.designpatterns.factory.Note8;
import com.designpatterns.factory.S8;
import com.designpatterns.factory.Telefon;

public class Note8Fabrikası implements TelefonFactory {
    @Override
    public Telefon getTelefon(String model, String batarya, int en, int boy) {
        return new Note8(model, batarya, en, boy);
    }
}
