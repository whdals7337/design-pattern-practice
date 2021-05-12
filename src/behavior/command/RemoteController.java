package behavior.command;

import java.util.Arrays;

public class RemoteController {
    static final int MAX_SLOT = 8;
    Command[] commands;

    public RemoteController() {
        commands = new Command[MAX_SLOT];
        Arrays.fill(commands, new NoCommand());
    }

    public void registerCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void buttonPress(int slot) {
        commands[slot].execute();
    }
}
