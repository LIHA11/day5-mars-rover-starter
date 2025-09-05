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

        if(command.equals("back")){
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

        if (command.equals("left")) {
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
        if (command.equals("right")) {
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

    }
}

