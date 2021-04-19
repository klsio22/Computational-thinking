package URI.BaseIOO;
//KLESIO ANTONIO DO NASCIMENTO
import java.io.IOException;
import java.util.Scanner;

public class BaseIOO {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.entradaDados();
    }
}

class InterfaceTexto {
    private final Scanner entrada;
    private NomeDoExercicioObjeto nomeDaIntacia;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        nomeDaIntacia = new NomeDoExercicioObjeto();
    }

    public void entradaDados() {
        nomeDaIntacia.setX(entrada.nextInt());
        System.out.println(nomeDaIntacia.getRetornarString());
    }
}

class NomeDoExercicioObjeto {
    private int x;

    public void setX(int x) {
        this.x = x;
    }

    public String getRetornarString(){
        return"";
    }
}