package model;

import service.Observable;

import java.util.Date;

public class Client extends Man implements Observable {

    private String email;
    private String tel;

    private boolean wasChange = false;

    public Client(String name, Date birth, char sex) {
        super(name, birth, sex);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.wasChange = true;
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Клиент: "+super.getName()+"; email ["+ this.getEmail()+"]"+" гражданство "+this.getGrajdanin()+"\n";
    }

    @Override
    public String sayName() {
        return this.getName();
    }

    @Override
    public boolean wasChange() {
        boolean res = this.wasChange;
        this.wasChange= false;
        return res;
    }
}

