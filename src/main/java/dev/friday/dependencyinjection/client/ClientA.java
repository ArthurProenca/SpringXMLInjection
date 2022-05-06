package dev.friday.dependencyinjection.client;

public class ClientA implements Client {
    Service service;

    public ClientA(Service service) {
        this.service = service;
    }

    @Override
    public void doSomething(){
        String info = service.getInfo();
        System.out.println("ClientA: " + info);
    }

    public void setService(Service service) {
        this.service = service;
    }
}
