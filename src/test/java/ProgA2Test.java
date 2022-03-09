import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;

public class ProgA2Test {

    @Test
    public void testMain()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        StandardInputStream in = new StandardInputStream();
        System.setIn(in);

        // action
        // in.inputln("2"); // 標準入力をテストする場合
        // Hello.main(new String[]{"1", "2", "3"}); // 実行時引数をテストする場合
        ProgA2.main(null);

        // assertion
        String[] prints = bos.toString().split("\n");
        assertEquals("最終HPは10でした。\n", prints[prints.length - 1]);

        // undo the binding in System
        System.setOut(originalOut);
    }
}
