package anderson;

import java.util.Scanner;

public class NumeroDecrescente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int numero = teclado.nextInt();
        System.out.println("A ordem decrescente dos números é: ");
        for (int i=numero; i>=0; i = i-1) {
            System.out.println(i);

        }
    }
}
