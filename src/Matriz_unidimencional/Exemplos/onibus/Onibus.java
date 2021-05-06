package Matriz_unidimencional.Exemplos.onibus;

public class Onibus {
    public static void main(String[] args) {
        Passageiro m = new Passageiro("Klesio");
        System.out.println(m.toString());
    }
}

class Passageiro {

    private String passageiros[];
    private int posicao;

    public Passageiro(String nome) {
        passageiros = new String[24];//0 a 23
        posicao = 0;
    }

    public boolean getAdicinar(String nomeCompleto) {
        if (posicao < 0 || posicao >= 24)
            return false;
        passageiros[posicao] = nomeCompleto;
        posicao++;

        return true;
    }

    public String toString() {
        if (posicao == 0)
            return "Onibus Vazio";

        String aux = "Ocupação das poltronas";
        for (int i = 0; i < posicao; i++)
            aux +=  i + 1 + "." + passageiros[i] + "\n";

        return aux;
    }

}