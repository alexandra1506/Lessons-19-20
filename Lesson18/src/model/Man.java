package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Man {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    private String name;//имя
    private Date birth;//Дата рождения
    private char sex;//Пол

    private String grajdanin;

    public Man(String name, Date birth, char sex) {
        this.name = name;
        this.birth = birth;
        this.sex = sex;
    }

    public String getGrajdanin() {
        return grajdanin;
    }

    public void setGrajdanin(String grajdanin) {
        this.grajdanin = grajdanin;
    }

    public String toString(){
        return "Имя : "+this.name+" пол("+((this.sex == 'm')? "муж.": "жен." )+"); Дата рождения : "+ dateFormat.format(this.birth)+";";
    }

    public String getName() {
        return name;
    }

    public Date getBirth() {
        return birth;
    }

    public char getSex() {
        return sex;
    }

    public static SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public static void setDateFormat(SimpleDateFormat dateFormat) {
        Man.dateFormat = dateFormat;
    }
}
