package model;

import service.Event;
import service.Observable;

import java.text.ParseException;
import java.util.Date;
import java.util.LinkedList;

public class Person extends Man implements Observable {

    private String position;// должность
    private Date exp; // стаж работы
    private boolean wasChange = false; // true - если были изменения

    private Event event;

    private LinkedList clientList = new LinkedList();

    public void registrationEvent(Event event){
        this.event = event;
    }

    private void generationEvent(String eventName, String objName){
        if(this.event != null)  this.event.emit(eventName, objName);
    }

    // добавление нового клиента
    public void addNewClient(Client client){
        generationEvent("addNewClient", this.getName());
        this.wasChange = true;
        this.clientList.add(client);
    }

    public LinkedList getClientList() {
        return clientList;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getExp() {
        return exp;
    }

    public void setExp(Date exp) {
        this.exp = exp;
    }

    public Person(String name, Date birthDay, char sex) throws ParseException {
        super(name, birthDay, sex);
        this.position = position;
        this.exp = Man.getDateFormat().parse("12.03.2009");
    }

    @Override
    public String toString() {
        return "Сотрудник: "+ super.toString() + "; должность - "+this.position+
                ""+" стаж - "+Man.getDateFormat().format(this.exp)
                + "Cписок клиентов - ["+this.clientList.toString()+"]";
    }

    @Override
    public String sayName() {
        return this.getName();
    }

    @Override
    public boolean wasChange() {
        boolean res = this.wasChange;
        this.wasChange=false;
        return res;

    }
}
