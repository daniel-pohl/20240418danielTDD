import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {
    @Test
    public void getXWhenReturn0(){
        int actual = PlayerCharacter.getX();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void getYWhenReturn0(){
        int actual = PlayerCharacter.getY();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void moveWhenStringWThenReturnY1(){
        int actual = PlayerCharacter.move('W');
        int expected = 1;
        assertEquals(expected, actual);
    }
}
