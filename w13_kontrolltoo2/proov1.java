import java.util.ArrayList;
import java.util.List;

public class proov1 {
    public static void main(String[] arg){
        Toit toit = new Toit();
        toit.lisaAine("kartul", 1.9, 0.1, 15.5);
        toit.lisaAine("hapukoor", 3.3, 21.5, 3.8);
        toit.lisaAine("vorst", 9.6, 21.8, 7.2);


        List<String> toiduained = new ArrayList<>();
        toiduained.add("kartul");
        toiduained.add("hapukoor");
        toiduained.add("vorst");
        toit.lisaToit("kartulisalat", toiduained);


        toit.lisaKogus("kartul", 55.5);
        toit.lisaKogus("hapukoor", 16.7);
        toit.lisaKogus("vorst", 27.8);

        System.out.println("Rasva sisaldus vorstis: " + toit.kysiRasv("vorst"));

        toit.kysiToiteVaartus("kartulisalat");
        toit.kysiRetseptiKogus("kartulisalat", 5);

    }
}
