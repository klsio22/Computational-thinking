package URI.FibonacciFacilEx1151;

//KLESIO ANTONIO DO NASCIMENTO
import java.io.IOException;
import java.util.Scanner;

public class FibonacciFacilEx1151 {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.entradaDados();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private Fibonacci valores;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        valores = new Fibonacci();
    }

    public void entradaDados() {
        valores.setValores(entrada.nextInt());
        System.out.println(valores.getSequenciaFibonacci());
    }
}

class Fibonacci {
    private int valores;
    private String Fibonacci = "";

    public void setValores(int valores) {
        if (valores > 0 && valores < 46)
            this.valores = valores;
    }

    public String getSequenciaFibonacci() {
        for (int i = 0; i < valores; i++) {
            Fibonacci += getFibonacci(i) + " ";
        }
        return Fibonacci.trim();
    }

    private int getFibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
}
