
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
    @Test
    public void newEncrypt_instantiatesCorrectly() {
        EncryptClass testEncrypt = new EncryptClass();
        assertEquals(true, testEncrypt instanceof EncryptClass);
    }

    @Test
    public void newDecrypt_instantiatesCorrectly() {
        Decrypt testDecrypt = new Decrypt();
        assertEquals(true, testDecrypt instanceof Decrypt);
    }

    @Test
    public void newApp_instantiatesCorrectly() {
        App newApp = new App();
        assertEquals(true, newApp instanceof App);
    }

    @Test
    public void newCeasar_getMessage(){
        Caesar testCeasar = new Caesar("we attack at dawn", 4);
        assertEquals("we attack at dawn" ,testCeasar.getMessage());

    }
    @Test
    public void newCeasar_getShiftKey(){
        Caesar testCeasar = new Caesar("we attack at dawn", 4);
        assertEquals(4 ,testCeasar.getShiftKey());

    }



}
