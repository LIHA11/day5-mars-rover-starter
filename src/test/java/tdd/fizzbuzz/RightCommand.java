package tdd.fizzbuzz;

public class RightCommand implements Command {
    @Override
    public void execute(MarsRover rover) {
        switch (rover.direction) {
            case "N": rover.direction = "E"; break;
            case "E": rover.direction = "S"; break;
            case "S": rover.direction = "W"; break;
            case "W": rover.direction = "N"; break;
        }
    }
}

