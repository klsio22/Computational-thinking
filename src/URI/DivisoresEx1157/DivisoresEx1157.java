package URI.DivisoresEx1157;
////KLESIO ANTONIO DO NASCIMENTO
import java.io.IOException;
import java.util.Scanner;

public class DivisoresEx1157 {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.entradaDados();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private Divisores divisores;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        divisores = new Divisores();
    }

    public void entradaDados() {
        divisores.setValor(entrada.nextInt());
        System.out.print(divisores.getDivisores());
    }
}

class Divisores {
    private int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDivisores() {
        String divisores = "";
        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0) {
                divisores += i + "\n";
            }
        }
        return divisores;
    }
}
