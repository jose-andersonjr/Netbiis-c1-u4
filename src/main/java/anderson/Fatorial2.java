package anderson;

import javax.swing.*;

public class Fatorial2 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        int fatorial = 1;
        int i = numero;
        do {
            fatorial = fatorial * numero;
            numero = numero - 1;
        }while(numero>=1);
        JOptionPane.showMessageDialog(null, "O resultado do fatorial de "+i+" é " + fatorial);
    }
}
