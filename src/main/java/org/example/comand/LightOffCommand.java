package org.example.comand;

public class LightOffCommand implements Command {
    private Garage garage;

    public LightOffCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.off();
    }
}
