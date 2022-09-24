package anderson;

import java.util.Scanner;

public class MostrarTabuada {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int i, numero, total = 1;
        System.out.println("Favor inserir um número: ");
        numero = teclado.nextInt();
        for (i=1;i<=10;i++) {
            total = numero * i;
            System.out.println("Número: " + numero + " x " +i+ " = " + total);
        }
    }
}
