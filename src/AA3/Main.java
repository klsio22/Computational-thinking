package AA3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("informe o valor de N alogoritmos");
        NumeroInteiro fat = new NumeroInteiro();
        fat.setN(entrada.nextInt());

        System.out.println(fat.getN());
        System.out.println(fat.getFormula());
    }

}
