package com.designpatterns.abstractfactory;

import com.designpatterns.factory.Telefon;

public interface TelefonFactory {

    Telefon getTelefon(String model, String batarya, int en, int boy);
}
