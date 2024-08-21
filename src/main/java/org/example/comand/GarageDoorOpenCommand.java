package org.example.comand;

public class GarageDoorOpenCommand {
    Command command;
    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPress() {
        command.execute();

    }
}
