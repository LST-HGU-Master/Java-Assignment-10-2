import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;
/**
 * @version (20220605)
 **/
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
        // undo the binding in System
        System.setOut(originalOut);

        // assertion
        String[] prints = bos.toString().split("\r\n|\n", -1);
        assertEquals("最終HPは10でした。", prints[prints.length - 2],
            "main()メソッドのprint文の最終行が 最終HPは10でした。 となっていません!");
    }

}
