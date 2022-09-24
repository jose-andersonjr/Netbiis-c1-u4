package anderson;

import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        int soma_valor = 0;
        System.out.println("Favor informar um valor");
        Scanner teclado = new Scanner(System.in);
        var valor = teclado.nextInt();
        var cont = 0;
        while(valor!= -1){
            soma_valor = soma_valor + valor;
            cont++;
            System.out.println("Favor informar um valor: ");
            valor = teclado.nextInt();
        }
        System.out.println("Média = " + soma_valor/cont);
    }
}
