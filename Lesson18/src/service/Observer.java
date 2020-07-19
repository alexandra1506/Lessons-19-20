package service;

public class Observer implements Event {

    //массив наблюдаемых объектов
    private Observable[] objects = new Observable[50];

    //текущая длина
    private int length = -1;

    // регистрация объекта наблюдения
    public void addNewObjectToTracking(Observable observable) throws Exception {
        this.length++; // когда добавляется объект длину увеличиваем
        if (length < 50) {
            this.objects[this.length] = observable;
        } else {
            throw new Exception("Достигнут предел");
        }
    }

    public void printInformationAboutChange() {
        boolean res = false;
        for (int i = 0; i < this.length; i++) {
            if(this.objects[i].wasChange()){
                System.out.println("В объекте"+this.objects[i].sayName()+" - изменения.");
                res = true;
            }
        }
        if(!res) System.out.println("Никаких изменений не было");
    }

    @Override
    public void emit(String eventName, String objName) {
        System.out.println("Произошло событие ["+eventName+"] на объекте ["+objName+"]");
    }
}
