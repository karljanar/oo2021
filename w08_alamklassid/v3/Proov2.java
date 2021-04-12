package v3;

public class Proov2 {
    public static void kuvaOlek(Voolujuht v){
        if(v.kasJuhib()){
            System.out.println("Juhib");
        }else{
            System.out.println("Ei juhi");
        }
    }
    public static void main(String[] arg){

        //l1 & ([l2 v (l3 & l4) v l5]& [l6 v l7 vl8] & (l9 v l10) & l11) v l12
        Lyliti l1 = new Lyliti();
        Lyliti l2 = new Lyliti();
        Lyliti l3 = new Lyliti();
        Lyliti l4 = new Lyliti();
        Lyliti l5 = new Lyliti();
        Lyliti l6 = new Lyliti();
        Lyliti l7 = new Lyliti();
        Lyliti l8 = new Lyliti();
        Lyliti l9 = new Lyliti();
        Lyliti l10 = new Lyliti();
        Lyliti l11 = new Lyliti();
        Lyliti l12 = new Lyliti();


        Roopyhendus2 r1 = new Roopyhendus2();
        Roopyhendus2 r2 = new Roopyhendus2();
        Roopyhendus2 r3 = new Roopyhendus2();
        Roopyhendus2 r4 = new Roopyhendus2();
        jada j1 = new jada();
        jada j2 = new jada();

        l1.seisund(true);
        l2.seisund(false);
        l3.seisund(false);
        l4.seisund(false);
        l5.seisund(true);
        l6.seisund(true);
        l7.seisund(false);
        l8.seisund(false);
        l9.seisund(false);
        l10.seisund(true);
        l11.seisund(true);
        l12.seisund(false);


        j1.lisa(l1);
        j2.lisa(l3);
        j2.lisa(l4);
        r1.lisa(l2);
        r1.lisa(j2);
        r1.lisa(l5);
        j1.lisa(r1);

        r2.lisa(l6);
        r2.lisa(l7);
        r2.lisa(l8);
        j1.lisa(r2);

        r3.lisa(l9);
        r3.lisa(l10);
        j1.lisa(r3);
        j1.lisa(l11);

        r4.lisa(l12);
        r4.lisa(j1);
        kuvaOlek(r4);

    }
}
