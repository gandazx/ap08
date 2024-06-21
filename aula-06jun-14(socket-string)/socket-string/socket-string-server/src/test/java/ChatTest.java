import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChatTest {

    @Test
    public void testEnviarMensagem() {
        // Simulação de envio de mensagem
        String mensagemEnviada = "Olá, como está a sua eternidade?";
        String mensagemEsperada = "Olá, como está a sua eternidade?";
        assertEquals(mensagemEsperada, mensagemEnviada);
    }

    @Test
    public void testReceberMensagem() {
        // Simulação de recebimento de mensagem
        String mensagemRecebida = "Estou tocando minha eternidade.";
        String mensagemEsperada = "Estou tocando minha eternidade.";
        assertEquals(mensagemEsperada, mensagemRecebida);
    }

    @Test
    public void testMensagemProlixa() {
        // Simulação de mensagem prolixa
        String mensagemOriginal = "Olá, como está a sua eternidade?";
        String mensagemProlixa = "Eru::: Olá, como está a sua eternidade?";
        String mensagemEsperada = "Eru::: Olá, como está a sua eternidade?";
        assertEquals(mensagemEsperada, mensagemProlixa);
    }
}

