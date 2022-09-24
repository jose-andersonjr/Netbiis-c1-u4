package anderson;

import java.util.Scanner;

public class CalculaValorE {
    public static void main(String[] args) {
        double x, e = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor insira o valor de X: ");
        x = teclado.nextInt();

        for (int i=1;i<=50;i++) {
            e = e + Math.pow(x, i)/i;

        }
        System.out.println("O valor de E^"+x+"="+e);
    }
}
