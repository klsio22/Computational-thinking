package URI;
//KLESIO ANTONIO DO NASCIMENTO
import java.io.IOException;
import java.util.Scanner;
import  java.util.Locale;
public class ex1012 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);
        double A = 0 , B = 0 , C = 0;
        double pi = 3.14159;

        A = ent.nextDouble();
        B = ent.nextDouble() ;
        C = ent.nextDouble() ;

        System.out.printf("TRIANGULO: %.3f\n" +
                "CIRCULO: %.3f\n" +
                "TRAPEZIO: %.3f\n" +
                "QUADRADO: %.3f\n" +
                "RETANGULO: %.3f\n", ((A*C)/2),
                (pi* (Math.pow(C , 2))),
                (((A+B)*C)/2), (B*B), (A*B));
    }
}
