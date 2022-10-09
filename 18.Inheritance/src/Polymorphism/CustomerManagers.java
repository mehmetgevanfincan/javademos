package Polymorphism;

public class CustomerManagers {
    private BaseLogger logger;

    public CustomerManagers(BaseLogger logger){
        this.logger = logger;
    }

    public void add() {
        System.out.println("Müşteri eklendi");
        this.logger.log("log mesajı");
    }
}
