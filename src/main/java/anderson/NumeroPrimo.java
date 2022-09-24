package anderson;

import javax.swing.*;

public class NumeroPrimo {
    public static void main(String[] args) {
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
        int qtd_divisores = 0;

        for(int i=1; i <= numero; i++)
        {
            if(numero%i == 0)
                qtd_divisores++;
        }
        if (qtd_divisores == 2)
            JOptionPane.showMessageDialog(null, "O número "+numero+" é Primo!");
        else
            JOptionPane.showMessageDialog(null, "O número "+numero+" não é Primo!");
    }
}
