package anderson;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar o número a: ");
        var a = teclado.nextInt();
        System.out.println("Favor informar o número b: ");
        var b = teclado.nextInt();
        if ((a>0) && (b>0)) {
            if (a>b) {
                for (int i=b+1;i<a;i++){
                    if (i%2==0) {
                        System.out.println("O número: " +i+ " é par!");
                    }
                }
            }else{
                for (int i=a+1;i<b;i++){
                    if (i%2==0) {
                        System.out.println("O número: " +i+ " é par!");
                    }
                }
            }
        }else{
            System.out.println("Por favor insira a e b maiores que 0");
            NumerosPares.main(null);
        }
    }
}
