
import org.example.App;
import org.example.Caesar;
import org.example.Decrypt;
import org.example.EncryptClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEncrypt {
    @Test
    public void newCeasar_instantiatesCorrectly() {
        Caesar testCeasar = new Caesar("we attack at dawn", 4);

        assertEquals(true, testCeasar instanceof Caesar);
    }



}
