package tdd.fizzbuzz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarsRover {
    public int x;
    public int y;
    public String direction;

    private static final Map<String, Command> commandMap = new HashMap<>();
    static {
        commandMap.put("move", new MoveCommand());
        commandMap.put("back", new BackCommand());
        commandMap.put("left", new LeftCommand());
        commandMap.put("right", new RightCommand());
    }

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move(String command) {
        Command cmd = commandMap.get(command);
        if (cmd != null) {
            cmd.execute(this);
        }
    }

    public void executeCommands(List<String> commands) {
        commands.forEach(this::move);
    }
    public void executeCommands(String commands) {
        java.util.Arrays.stream(commands.split(",")).map(String::trim).forEach(this::move);
    }
}
