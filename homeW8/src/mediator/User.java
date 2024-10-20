package mediator;

public class User {
    private String name;
    private IMediator mediator;

    public User(IMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void sendMessage(String message) {
        System.out.println(this.name + " отправляет сообщение: " + message);
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(this.name + " получил сообщение: " + message);
    }
}
