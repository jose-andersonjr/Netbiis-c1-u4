package anderson;

public class AlgoritmoFibonacci {
    public static void main(String[] args) {
        int s1=0, s2=1, sn=0;
        System.out.println(s1);
        System.out.println(s2);
        for (int i=3; i<=10;i++) {

            sn = s1 + s2;
            s1 = s2;
            s2 = sn;
            System.out.println(sn);

        }

    }
}
