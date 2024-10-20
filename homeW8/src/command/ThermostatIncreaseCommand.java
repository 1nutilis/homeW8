package command;

public class ThermostatIncreaseCommand implements ICommand{
    private Thermostat thermostat;

    public ThermostatIncreaseCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void execute() {
        thermostat.increase();
    }

    public void undo() {
        thermostat.decrease();
    }
}
