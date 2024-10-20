package command;

public class RemoteControl {
    private ICommand[] onCommands;
    private ICommand[] offCommands;
    private ICommand lastCommand;

    public RemoteControl(int slots) {
        onCommands = new ICommand[slots];
        offCommands = new ICommand[slots];
    }

    public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pressOnButton(int slot) {
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void pressOffButton(int slot) {
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
    }

    public void pressUndoButton() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }
}
