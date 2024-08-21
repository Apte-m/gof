package org.example.comand;

public class LightOnCommand  implements Command{
    private Garage garage;

    public LightOnCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.on();
    }
}
