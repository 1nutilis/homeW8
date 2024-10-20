package command;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(3);


        Light light = new Light();
        Door door = new Door();
        Thermostat thermostat = new Thermostat();


        ICommand lightOn = new LightOnCommand(light);
        ICommand lightOff = new LightOffCommand(light);


        ICommand doorOpen = new DoorOpenCommand(door);
        ICommand doorClose = new DoorCloseCommand(door);


        ICommand thermostatIncrease = new ThermostatIncreaseCommand(thermostat);
        ICommand thermostatDecrease = new ThermostatIncreaseCommand(thermostat);


        remote.setCommand(0, lightOn, lightOff);
        remote.setCommand(1, doorOpen, doorClose);
        remote.setCommand(2, thermostatIncrease, thermostatDecrease);


        System.out.println("Управление светом:");
        remote.pressOnButton(0);
        remote.pressOffButton(0);
        remote.pressUndoButton();

        System.out.println("Управление дверью:");
        remote.pressOnButton(1);
        remote.pressOffButton(1);
        remote.pressUndoButton();

        System.out.println("Управление термостатом:");
        remote.pressOnButton(2);
        remote.pressUndoButton();
    }
}