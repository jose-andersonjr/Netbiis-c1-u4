package anderson;

public class SequenciaS {
    public static void main(String[] args) {
        double somatoria, termo9=0, termo100=0, termo10=0, termo10000=0;
        somatoria = 1;
        for (int i=2;i<=10000;i++) {
            somatoria = somatoria + 3;
            if (i==9) {
                termo9 = somatoria;
            } else if (i==10) {
                termo10 = somatoria;
            } else if (i==100) {
                termo100 = somatoria;
            } else if (i==10000) {
                termo10000 = somatoria;
            }
        }
        System.out.println("O valor do termo9 é igual a " + termo9);
        System.out.println("O valor do termo10 é igual a " + termo10);
        System.out.println("O valor do termo100 é igual a " + termo100);
        System.out.println("O valor do termo10000 é igual a " + termo10000);
    }
}
