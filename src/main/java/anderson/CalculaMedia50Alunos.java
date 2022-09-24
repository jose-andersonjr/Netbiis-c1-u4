package anderson;

import javax.swing.*;

public class CalculaMedia50Alunos {
    public static void main(String[] args) {
        double nota1, nota2, media_geral = 0;
        int numero_alunos = 50;
        for (int i=1;i<=numero_alunos; i++) {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da nota 1 do aluno " + i + ": "));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da nota 2 do aluno " + i +": "));
            media_geral = media_geral + (nota1+nota2)/2;
        }
        media_geral = media_geral/numero_alunos;
        JOptionPane.showMessageDialog(null, "A média geral dos alunos é " + media_geral);

    }
}
