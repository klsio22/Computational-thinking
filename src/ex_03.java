import java.util.Scanner;

public class ex_03 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        int a = 0,b = 0,c = 0 ,soma = 0;

        System.out.print("Digite o primeiro número: ");

        a = entrada.nextInt();

        System.out.print("Digite o Segundo número: ");

        b = entrada.nextInt();

        soma = a + b ;

        System.out.printf("A soma é : %d " , soma);

    }

}
