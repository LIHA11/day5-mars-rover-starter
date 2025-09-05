package tdd.fizzbuzz;

public class MarsRover {
    public int x;
    public int y;
    public String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move(String command) {
        switch (command) {
            case "move":
                moveForward();
                break;
            case "back":
                moveBackward();
                break;
            case "left":
                turnLeft();
                break;
            case "right":
                turnRight();
                break;
            default:
        }
    }

    private void moveForward() {
        if (direction.equals(MarsDirectionEnum.N.name())) {
            this.y += 1;
        } else if (direction.equals(MarsDirectionEnum.S.name())) {
            this.y -= 1;
        } else if (direction.equals(MarsDirectionEnum.E.name())) {
            this.x += 1;
        } else if (direction.equals(MarsDirectionEnum.W.name())) {
            this.x -= 1;
        }
    }

    private void moveBackward() {
        if (direction.equals(MarsDirectionEnum.N.name())) {
            this.y -= 1;
        } else if (direction.equals(MarsDirectionEnum.S.name())) {
            this.y += 1;
        } else if (direction.equals(MarsDirectionEnum.E.name())) {
            this.x -= 1;
        } else if (direction.equals(MarsDirectionEnum.W.name())) {
            this.x += 1;
        }
    }

    private void turnLeft() {
        if (direction.equals(MarsDirectionEnum.N.name())) {
            this.direction = MarsDirectionEnum.W.name();
        } else if (direction.equals(MarsDirectionEnum.W.name())) {
            this.direction = MarsDirectionEnum.S.name();
        } else if (direction.equals(MarsDirectionEnum.S.name())) {
            this.direction = MarsDirectionEnum.E.name();
        } else if (direction.equals(MarsDirectionEnum.E.name())) {
            this.direction = MarsDirectionEnum.N.name();
        }
    }

    private void turnRight() {
        if (direction.equals(MarsDirectionEnum.N.name())) {
            this.direction = MarsDirectionEnum.E.name();
        } else if (direction.equals(MarsDirectionEnum.E.name())) {
            this.direction = MarsDirectionEnum.S.name();
        } else if (direction.equals(MarsDirectionEnum.S.name())) {
            this.direction = MarsDirectionEnum.W.name();
        } else if (direction.equals(MarsDirectionEnum.W.name())) {
            this.direction = MarsDirectionEnum.N.name();
        }
    }

    public void executeCommands(java.util.List<String> commands) {
        commands.stream().forEach(this::move);
    }

    public void executeCommands(String commands) {
        java.util.Arrays.stream(commands.split(",")).map(String::trim).forEach(this::move);
    }
}
