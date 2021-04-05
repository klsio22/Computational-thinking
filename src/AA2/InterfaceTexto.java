package AA2;

import java.util.Scanner;

class InterfaceTexto {
    private final Scanner entrada;
    private final Cheque cheque;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        cheque = new Cheque();
    }

    public void EntradaDados() {
        cheque.setValor(entrada.nextInt());
        System.out.printf("%s", cheque.getValorPorExtenso());
    }
}