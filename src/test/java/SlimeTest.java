import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Method;
/**
 * @version (20220609)
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
    
    @Test
    public void testAttackParameter()
    {
        try {
            Slime slm = new Slime('A');
            Method setName = slm.getClass().getMethod("attack", Hero.class);
            if (setName != null) fail("Slimeクラスにattack(Hero 変数名)が定義されています!");
        } catch ( Exception e) {
            // Slime.attack(Hero) は定義されていないのでなにもしない
        }
        
        try {
            Slime slm = new Slime('A');
            Method setName = slm.getClass().getMethod("attack", Cleric.class);
            if (setName != null) fail("Slimeクラスにattack(Cleric 変数名)が定義されています!");
        } catch ( Exception e) {
            // Slime.attack(Cleric) は定義されていないのでなにもしない
        }
        
        try {
            Slime slm = new Slime('A');
            Method setName = slm.getClass().getMethod("attack", Character.class);
        } catch ( Exception e) {
            fail("Slimeクラスのattackメソッドの引数リストが間違っています");
        }
    }
}
