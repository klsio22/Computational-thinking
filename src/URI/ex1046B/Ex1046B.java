package URI.ex1046B;
//KLESIO ANTONIO DO NASCIMENTO

import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

public class Ex1046B {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Interfacetexto obj = new Interfacetexto();
        obj.executar();
    }
}

class Interfacetexto {
    private final Scanner entrada;
    private final TempoDeJogo tempo;

    public Interfacetexto() {
        entrada = new Scanner(System.in);
        tempo = new TempoDeJogo();
    }

    public void executar() {
        tempo.setHoraInicial(entrada.nextInt());
        tempo.setHoraFinal(entrada.nextInt());
        System.out.print(tempo.getTempoDeJogo());
    }

}

class TempoDeJogo {
    private int horaInicial, horaFinal;

    public void setHoraInicial(int horaInicial) {
        this.horaInicial = horaInicial;
    }

    public void setHoraFinal(int horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getTempoDeJogo() {
        int x;

        if (horaInicial > horaFinal) {
            x = Math.abs(horaInicial - 24);
            x += horaFinal;
            return ("O JOGO DUROU " + x + " HORA(S)\n");
        } else if (horaInicial < horaFinal) {
            x = horaFinal - horaInicial;
            return ("O JOGO DUROU " + x + " HORA(S)\n");
        } else {
            return ("O JOGO DUROU 24 HORA(S)\n");
        }

    }
}