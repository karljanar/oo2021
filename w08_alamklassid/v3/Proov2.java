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


        Lyliti l1 = new Lyliti();
        Lyliti l2 = new Lyliti();
        Lyliti l3 = new Lyliti();
        Lyliti l4 = new Lyliti();
        pooraja p1 = new pooraja(l3);
        pooraja p2 = new pooraja(l4);
        Roopyhendus2 r = new Roopyhendus2();
        jada j1 = new jada();
        jada j2 = new jada();
        l1.seisund(true);
        l2.seisund(true);
        j1.lisa(l1);
        j1.lisa(l2);
        p1.seisund(true);
        p2.seisund(true);


        j2.lisa(l3);
        j2.lisa(l4);
        kuvaOlek(j1);
        kuvaOlek(j2);
        r.lisa(j1);
        r.lisa(j2);
        kuvaOlek(r);

        //j2.lisa(p1);
        //j2.lisa(p2);

    }
}
