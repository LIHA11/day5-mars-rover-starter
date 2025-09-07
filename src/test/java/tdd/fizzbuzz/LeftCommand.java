package tdd.fizzbuzz;

public class LeftCommand implements Command {
    @Override
    public void execute(MarsRover rover) {
        switch (rover.direction) {
            case "N": rover.direction = "W"; break;
            case "W": rover.direction = "S"; break;
            case "S": rover.direction = "E"; break;
            case "E": rover.direction = "N"; break;
        }
    }
}

