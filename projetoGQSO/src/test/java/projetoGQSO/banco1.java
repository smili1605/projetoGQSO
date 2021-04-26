package projetoGQSO;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class banco1 {
    Banco banco;

    @BeforeEach
    public void setUp() {
        banco = new Banco();
        banco.deposito(100);
    }

    @Test
    public void testeSaque() throws SaldoInsuficiente {
        assertEquals(banco.saldo() - 50, banco.saque(50));
        assertEquals(banco.saldo() - 50, banco.saque(50));
    }
}