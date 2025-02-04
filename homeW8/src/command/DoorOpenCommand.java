package command;

public class DoorOpenCommand implements ICommand{
    private Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    public void execute() {
        door.open();
    }

    public void undo() {
        door.close();
    }
}
