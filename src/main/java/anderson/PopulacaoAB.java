package anderson;

public class PopulacaoAB {
    public static void main(String[] args) {
        final double habitantesA = 5000000;
        final double habitantesB = 7000000;
        final double taxaA = 0.02;
        final double taxaB = 0.01;
        int tempo = 0;
        double populacaoA = habitantesA;
        double populacaoB = habitantesB;
        while(populacaoB >= populacaoA){
            populacaoB = populacaoB + (populacaoB*taxaB);
            populacaoA = populacaoA + (populacaoA*taxaA);
            tempo++;
        }
        System.out.println("A população A levará " +tempo+" anos para ultrapassar a populaçao de B");
    }
}
