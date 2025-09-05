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
        if (command.equals("move")) {
            if (direction.equals("N")) {
                this.y += 1;
            } else if (direction.equals("S")) {
                this.y -= 1;
            } else if (direction.equals("E")) {
                this.x += 1;
            } else if (direction.equals("W")) {
                this.x -= 1;
            }
        }
        if (command.equals("left")) {
            if (direction.equals("N")) {
                this.direction = "W";
            } else if (direction.equals("W")) {
                this.direction = "S";
            } else if (direction.equals("S")) {
                this.direction = "E";
            } else if (direction.equals("E")) {
                this.direction = "N";
            }
        }
        if (command.equals("right")) {
            if (direction.equals("N")) {
                this.direction = "E";
            } else if (direction.equals("E")) {
                this.direction = "S";
            } else if (direction.equals("S")) {
                this.direction = "W";
            } else if (direction.equals("W")) {
                this.direction = "N";
            }
        }

    }
}
