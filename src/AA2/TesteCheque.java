package AA2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TesteCheque {

    private Cheque cheque = new Cheque();

    @Test
    public void teste123456()
    {
        cheque.setValor(123456);
        assertEquals("cento e vinte e três mil e quatrocentos e cinquenta e seis reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste654321()
    {
        cheque.setValor(654321);
        assertEquals("seiscentos e cinquenta e quatro mil e trezentos e vinte e um reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste1()
    {
        cheque.setValor(1);
        assertEquals("um real",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste3()
    {
        cheque.setValor(3);
        assertEquals("três reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste10()
    {
        cheque.setValor(10);
        assertEquals("dez reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste15()
    {
        cheque.setValor(15);
        assertEquals("quinze reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste115()
    {
        cheque.setValor(115);
        assertEquals("cento e quinze reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste25()
    {
        cheque.setValor(25);
        assertEquals("vinte e cinco reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste100()
    {
        cheque.setValor(100);
        assertEquals("cem reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste90009()
    {
        cheque.setValor(90009);
        assertEquals("noventa mil e nove reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste51009()
    {
        cheque.setValor(51009);
        assertEquals("cinquenta e um mil e nove reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste510009()
    {
        cheque.setValor(510009);
        assertEquals("quinhentos e dez mil e nove reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste121000()
    {
        cheque.setValor(121000);
        assertEquals("cento e vinte e um mil reais",
                cheque.getValorPorExtenso());
    }


    @Test
    public void teste300000()
    {
        cheque.setValor(300000);
        assertEquals("trezentos mil reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste301009()
    {
        cheque.setValor(301009);
        assertEquals("trezentos e um mil e nove reais",
                cheque.getValorPorExtenso());
    }
    @Test
    public void teste19009()
    {
        cheque.setValor(19009);
        assertEquals("dezenove mil e nove reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste91009()
    {
        cheque.setValor(91009);
        assertEquals("noventa e um mil e nove reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void testeMenos2159()
    {
        cheque.setValor(-2159);
        assertEquals("",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste0()
    {
        cheque.setValor(0);
        assertEquals("",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste11010()
    {
        cheque.setValor(11010);
        assertEquals("onze mil e dez reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste400001()
    {
        cheque.setValor(400001);
        assertEquals("quatrocentos mil e um reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste10001()
    {
        cheque.setValor(10001);
        assertEquals("dez mil e um reais",
                cheque.getValorPorExtenso());
    }


    @Test
    public void teste101()
    {
        cheque.setValor(101);
        assertEquals("cento e um reais",
                cheque.getValorPorExtenso());
    }

    @Test
    public void teste101000()
    {
        cheque.setValor(101000);
        assertEquals("cento e um reais",
                cheque.getValorPorExtenso());
    }

}

