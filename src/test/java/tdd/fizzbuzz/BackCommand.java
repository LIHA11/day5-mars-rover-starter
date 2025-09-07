package tdd.fizzbuzz;

public class BackCommand implements Command {
    @Override
    public void execute(MarsRover rover) {
        switch (rover.direction) {
            case "N": rover.y -= 1; break;
            case "S": rover.y += 1; break;
            case "E": rover.x -= 1; break;
            case "W": rover.x += 1; break;
        }
    }
}

