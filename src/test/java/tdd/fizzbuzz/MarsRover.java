package tdd.fizzbuzz;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move(String direction) {
      if (direction.equals("N")) {
          this.y += 1;
      } else if (direction.equals("S")) {
          this.y -= 1;
      } else if (direction.equals("E")) {
          this.x += 1;
      } else if (direction.equals("W")) {
          this.x -= 1;
      }
      this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }
}
