import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @Test
    public void getXWhenReturn0(){
        //GIVEN

        //WHEN
        int actual = PlayerCharacter.getX();
        //THEN
        int expected = 0;
        assertEquals(expected, actual);
    }


}
