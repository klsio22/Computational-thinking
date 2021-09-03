package Avaliação_recuperação;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TesteMatrizDeInteiros {
    private MatrizDeInteiros m;

    int tresPorTres[][] =
            {{11, 3, 7},
                    {6, 2, 1},
                    {2, 9, 4}};

    @Test
    public void testeTresPorTresAltera() {
        String resposta =
                "7\t3\t11\t\n" +
                        "1\t2\t6\t\n" +
                        "4\t9\t2\t\n";

        m = new MatrizDeInteiros(tresPorTres);
       // m.altera();
        assertEquals(resposta, m.toString());
    }

    @Test
    public void testeTresPorTresTotaliza() {
        int resposta[] = {21, 9, 15};
        m = new MatrizDeInteiros(tresPorTres);

       // assertArrayEquals(resposta, m.totaliza());
    }
}