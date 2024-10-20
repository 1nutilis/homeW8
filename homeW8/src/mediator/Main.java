package mediator;

public class Main {
    public static void main(String[] args) {
        IMediator chatRoom = new ChatRoom();

        User alice = new User(chatRoom, "Алиса");
        User bob = new User(chatRoom, "Боба");
        User semen = new User(chatRoom, "Семен");

        chatRoom.addUser(alice);
        chatRoom.addUser(bob);
        chatRoom.addUser(semen);

        alice.sendMessage("Привет всем!");
        bob.sendMessage("Привет, Алиса!");
    }
}
