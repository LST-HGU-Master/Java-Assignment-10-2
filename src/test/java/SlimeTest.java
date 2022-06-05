import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;
/**
 * @version (20220605)
 **/
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
        assertEquals(75, hr.hp, 
            "Slimeクラスのインスタンスのattack()によるhpの変化が正しくありません!");//85->75
        assertEquals(15, clr.hp, 
            "Slimeクラスのインスタンスのattack()によるhpの変化が正しくありません!");
    }
}
