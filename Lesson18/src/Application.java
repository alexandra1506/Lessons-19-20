import collections.LinkedList;
import model.Client;
import model.FamilyMember;
import model.Person;
import service.Observer;
import service.Randomizer;

import java.text.SimpleDateFormat;

public class Application {

    public static void main(String[] args){

    SimpleDateFormat dataFormat = new SimpleDateFormat("dd.MM.yyyy");
    LinkedList personList = new LinkedList();
        System.out.println(personList.toString());
        Observer observer = new Observer();
        try{

            Object obj = null;
            for(int j=1; j<4; j++) {
                Person person = new Person("Объект №", dataFormat.parse("01.01.2000"), 'm');
                observer.addNewObjectToTracking(person);
                person.registrationEvent(observer);
                //Randomizer.fillParameters(obj);

                for (int i = 0; i < 4; i++) {
                    Client client = new Client("Клиент №" + i, dataFormat.parse("04.01.2010"), 'm');
                    Randomizer.fillParameters(client);
                    person.addNewClient(client);
                    observer.addNewObjectToTracking(client);
                }
                personList.add(person);
            }
            System.out.println(personList.toString());

            observer.printInformationAboutChange();


    }catch(Exception e){
        System.out.println("ERROR : "+e.getMessage());
    }
    }
}