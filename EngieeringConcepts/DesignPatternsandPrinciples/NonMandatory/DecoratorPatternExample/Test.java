package DecoratorPatternExample;

public class Test {
    public static void main(String[] args) {
        
        Notifier email = new EmailNotifier();
        email.send();

        email = new SMSNotifierDecorator(email);
        email.send();

        email = new SlackNotifierDecorator(email);
        email.send();
    }
}
