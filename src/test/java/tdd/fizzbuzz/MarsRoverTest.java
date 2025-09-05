package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    public void should_return_x_1_y_2_N_when_x_1_y_1_move_N(){
        String direction = "move";
        MarsRover marsRover = new MarsRover(1,1,"N");
        marsRover.move(direction);
        assertEquals(1,marsRover.x);
        assertEquals(2,marsRover.y);
        assertEquals("N",marsRover.direction);
    }
    @Test
    public void should_return_x_1_y_0_S_when_x_1_y_1_move_S(){
        String direction = "move";
        MarsRover marsRover = new MarsRover(1,1,"S");
        marsRover.move(direction);
        assertEquals(1,marsRover.x);
        assertEquals(0,marsRover.y);
        assertEquals("S",marsRover.direction);
    }
    @Test
    public void should_return_x_0_y_1_W_when_x_1_y_1_move_W(){
        String direction = "move";
        MarsRover marsRover = new MarsRover(1,1,"W");
        marsRover.move(direction);
        assertEquals(0,marsRover.x);
        assertEquals(1,marsRover.y);
        assertEquals("W",marsRover.direction);
    }

    @Test
    public void should_return_x_2_y_1_S_when_x_1_y_1_move_E(){
        String direction = "move";
        MarsRover marsRover = new MarsRover(1,1,"E");
        marsRover.move(direction);
        assertEquals(2,marsRover.x);
        assertEquals(1,marsRover.y);
        assertEquals("E",marsRover.direction);
    }

    @Test
    public void should_return_x_1_y_0_N_when_x_1_y_1_moveBackward_N(){
        String direction = "back";
        MarsRover marsRover = new MarsRover(1,1,"N");
        marsRover.move(direction);
        assertEquals(1,marsRover.x);
        assertEquals(0,marsRover.y);
        assertEquals("N",marsRover.direction);
    }

    @Test
    public void should_return_x_1_y_2_N_when_x_1_y_1_moveBackward_S(){
        String direction = "back";
        MarsRover marsRover = new MarsRover(1,1,"S");
        marsRover.move(direction);
        assertEquals(1,marsRover.x);
        assertEquals(2,marsRover.y);
        assertEquals("S",marsRover.direction);
    }

    @Test
    public void should_return_x_0_y_1_when_x_1_y_1_moveBackward_E(){
        String direction = "back";
        MarsRover marsRover = new MarsRover(1,1,"E");
        marsRover.move(direction);
        assertEquals(2,marsRover.x);
        assertEquals(1,marsRover.y);
        assertEquals("E",marsRover.direction);
    }

    @Test
    public void should_return_x_2_y_1_when_x_1_y_1_moveBackward_W(){
        String direction = "back";
        MarsRover marsRover = new MarsRover(1,1,"W");
        marsRover.move(direction);
        assertEquals(2,marsRover.x);
        assertEquals(1,marsRover.y);
        assertEquals("W",marsRover.direction);
    }

    @Test
    public void should_return_x_1_y_1_W_when_x_1_y_1_left_N(){
        String command = "left";
        MarsRover marsRover = new MarsRover(1,1,"N");
        marsRover.move(command);
        assertEquals(1,marsRover.x);
        assertEquals(1,marsRover.y);
        assertEquals("W",marsRover.direction);
    }
    @Test
    public void should_return_x_1_y_1_N_when_x_1_y_1_left_E(){
        String command = "left";
        MarsRover marsRover = new MarsRover(1,1,"E");
        marsRover.move(command);
        assertEquals(1,marsRover.x);
        assertEquals(1,marsRover.y);
        assertEquals("N",marsRover.direction);
    }
    @Test
    public void should_return_x_1_y_1_E_when_x_1_y_1_left_S(){
        String command = "left";
        MarsRover marsRover = new MarsRover(1,1,"S");
        marsRover.move(command);
        assertEquals(1,marsRover.x);
        assertEquals(1,marsRover.y);
        assertEquals("E",marsRover.direction);
    }
    @Test
    public void should_return_x_1_y_1_S_when_x_1_y_1_left_W(){
        String command = "left";
        MarsRover marsRover = new MarsRover(1,1,"W");
        marsRover.move(command);
        assertEquals(1,marsRover.x);
        assertEquals(1,marsRover.y);
        assertEquals("S",marsRover.direction);
    }
    @Test
    public void should_return_x_1_y_1_E_when_x_1_y_1_right_N(){
        String command = "right";
        MarsRover marsRover = new MarsRover(1,1,"N");
        marsRover.move(command);
        assertEquals(1,marsRover.x);
        assertEquals(1,marsRover.y);
        assertEquals("E",marsRover.direction);
    }
    @Test
    public void should_return_x_1_y_1_S_when_x_1_y_1_right_E(){
        String command = "right";
        MarsRover marsRover = new MarsRover(1,1,"E");
        marsRover.move(command);
        assertEquals(1,marsRover.x);
        assertEquals(1,marsRover.y);
        assertEquals("S",marsRover.direction);
    }

    @Test
    public void should_return_x_1_y_1_W_when_x_1_y_1_right_S(){
        String command = "right";
        MarsRover marsRover = new MarsRover(1,1,"S");
        marsRover.move(command);
        assertEquals(1,marsRover.x);
        assertEquals(1,marsRover.y);
        assertEquals("W",marsRover.direction);
    }
    @Test
    public void should_return_x_1_y_1_N_when_x_1_y_1_right_W(){
        String command = "right";
        MarsRover marsRover = new MarsRover(1,1,"W");
        marsRover.move(command);
        assertEquals(1,marsRover.x);
        assertEquals(1,marsRover.y);
        assertEquals("N",marsRover.direction);
    }

}




