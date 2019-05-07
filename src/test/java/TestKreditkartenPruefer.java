import modul4.chapter3.KreditkartenPruefer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestKreditkartenPruefer {

   @Test
    public void testIsValidNumber() {
       KreditkartenPruefer kreditkartenPruefer = new KreditkartenPruefer();
       assertTrue(kreditkartenPruefer.isValidNumber(2718281828458567L));
       assertTrue(kreditkartenPruefer.isValidNumber(5475148316641028L));
       assertTrue(kreditkartenPruefer.isValidNumber(5142358646091710L));
       assertTrue(kreditkartenPruefer.isValidNumber(5292068884939029L));
       assertFalse(kreditkartenPruefer.isValidNumber(5292068884939729L));
   }
}
