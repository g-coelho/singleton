import org.example.Token;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TokenTest {

    @Test
    public void deveRetornarSequenciaToken(){
        Token.getInstance().setTokenSequencia("123");
        assertEquals("123", Token.getInstance().getTokenSequencia());
    }

}
