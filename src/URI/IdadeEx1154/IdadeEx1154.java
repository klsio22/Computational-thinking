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
    private final Scanner entrada;
    private MediaDaIdade idade;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        idade = new MediaDaIdade();
    }

    public void entradaDados() {
        idade.setIdade(entrada.nextInt());
        while (idade.getIdade() >= 0)
            idade.setIdade(entrada.nextInt());

        System.out.printf("%.2f\n",idade.getMedia());
    }
}

class MediaDaIdade {
    private int idade, soma, cont;
    private double media;

    public void setIdade(int idade) {
        if (idade >= 0) {
            soma += idade;
            cont++;
        }
        media = (double) soma / cont;
        this.idade = idade;
    }

    public double getMedia() {
        return media;
    }

    public int getIdade() {
        return idade;
    }

}