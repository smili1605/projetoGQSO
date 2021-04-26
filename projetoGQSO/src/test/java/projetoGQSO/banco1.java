package projetoGQSO;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import projetoGQSO.Banco.SaldoInsuficiente;

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
        assertThrows(Banco.SaldoInsuficiente.class, () -> banco.saque(200));
    }

    @Test
    public void testeDeposito() {
        assertEquals(banco.saldo() + 100, banco.deposito(100));
    }
}