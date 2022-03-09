import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;

public class SlimeTest {
    @Test
    public void testAttack()
    {
        // action
        Hero hr = new Hero("工太", 80);
        Cleric clr = new Cleric("ホーリー",20, 15);
        Slime slm = new Slime('A');

        slm.attack(hr);
        slm.attack(clr);

        // assertion
        assertEquals(85, hr.hp);
        assertEquals(15, clr.hp);
    }
}
