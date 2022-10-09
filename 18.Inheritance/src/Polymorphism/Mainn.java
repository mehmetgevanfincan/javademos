package Polymorphism;

public class Mainn {

    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//        for (BaseLogger logger:loggers) {
//            logger.log("Log Mesajı");
//        }

        CustomerManagers customerManagers = new CustomerManagers(new DatabaseLogger());
        customerManagers.add();

    }
}