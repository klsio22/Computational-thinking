package URI.IdadeEx1154;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class IdadeEx1154 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InterfaceTexto obj = new InterfaceTexto();
        obj.entradaDados();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private MediaDaIdade idade;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        idade = new MediaDaIdade();
    }

    public void entradaDados() {
        do {
            idade.setIdade(entrada.nextInt());
        }while (idade.getIdade() >= 0);

        System.out.printf("%.2f\n", idade.getMediaIdade());
    }
}

class MediaDaIdade {
    private int idade, soma, cont;

    public void setIdade(int idade) {
        if (idade >= 0) {
            soma += idade;
            cont++;
        }
        this.idade = idade;
    }

    public double getMediaIdade() {
        return (double) soma / cont;
    }

    public int getIdade() {
        return idade;
    }

}
