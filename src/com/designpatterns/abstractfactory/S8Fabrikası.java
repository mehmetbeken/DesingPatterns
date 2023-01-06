package com.designpatterns.abstractfactory;

import com.designpatterns.factory.S8;
import com.designpatterns.factory.Telefon;

public class S8Fabrikası implements TelefonFactory {
    @Override
    public Telefon getTelefon(String model, String batarya, int en, int boy) {
        return new S8(model, batarya, en, boy);
    }
}
