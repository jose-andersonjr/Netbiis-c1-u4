package anderson;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar um número: ");
        var a = teclado.nextInt();

        System.out.println("Favor informar um número: ");
        var b = teclado.nextInt();

        for (int i=a+1;i<b;i++){
            if (i%2==0) {
                System.out.println("O número: " +i+ " é par!");
            }
        }
    }
}
