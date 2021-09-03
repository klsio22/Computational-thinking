package AA4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteMatrizDeInteiros {

    private MatrizDeInteiros m;

    @Test
    public void testeTresPorTres() {
        int tresPorTres[][] = {{11, 3, 7}, {6, 2, 1}, {2, 9, 4}};
        //int umPorum[][] = {{11},{2}};

        // média = 5
        m = new MatrizDeInteiros(tresPorTres);
        assertEquals(6, m.escolhido());

    }

    @Test
    public void testeCincoPorCinco() {
        int cincoPorCinco[][] =
                {{-89, -75, 52, 99, 17},
                        {16, 22, 14, 94, 37},
                        {80, 14, 93, -75, -17},
                        {-83, 18, -99, -11, -91},
                        {77, 85, 32, -47, -28}};

        // média = 5,4
        m = new MatrizDeInteiros(cincoPorCinco);
        assertEquals(14, m.escolhido());
    }

}
