package anderson;

import java.util.Scanner;

public class CadastraAluno {
    public static void main(String[] args) {
        String nome, endereco, telefone;
        int matricula,cont;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar a matrícula do próximo aluno: ");
        matricula = teclado.nextInt();

        while (matricula != 0){
            System.out.println("Favor informar o nome ");
            nome = teclado.next();
            System.out.println("Favor informar o endereco ");
            endereco = teclado.next();
            System.out.println("Favor informar o telefone do aluno: ");
            telefone = teclado.next();
            System.out.println("Favor informar a matrícula do próximo aluno: ");
            matricula = teclado.nextInt();
        }
    }
}
