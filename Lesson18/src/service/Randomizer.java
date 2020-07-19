package service;

import model.Client;
import model.Man;
import model.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Randomizer {
    public static SimpleDateFormat dataFormat = new SimpleDateFormat("dd.MM.yyyy");

    public static void fillParameters(Object obj) throws ParseException {
        if (obj instanceof Person){
            Person person = (Person)obj;
            person.setPosition("Случайная профессия ");
            person.setExp(dataFormat.parse("15.06.2000"));
        }

        if (obj instanceof Client){
            Client client = (Client)obj;
            client.setEmail("random@mail.ru");
            client.setTel("8 (800) 000 000 00");
        }

        if(obj instanceof Man){
            Man man = (Man)obj;
            man.setGrajdanin("Рандомное гражданство");
        }

    }
}
