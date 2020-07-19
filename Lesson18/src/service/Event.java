package service;

public interface Event {

    void emit(String eventName,String objName);
}
