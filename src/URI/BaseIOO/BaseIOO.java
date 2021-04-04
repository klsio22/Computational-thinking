package URI.BaseIOO;
//KLESIO ANTONIO DO NASCIMENTO
import java.io.IOException;
import java.util.Scanner;

public class BaseIOO {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.EntradaDados();
    }
}

class InterfaceTexto {
    private final Scanner entrada;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
    }

    public void EntradaDados() {

    }
}

class NomeDoExercicioObjeto {

}