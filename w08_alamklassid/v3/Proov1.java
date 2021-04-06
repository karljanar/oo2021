package v3;


public class Proov1 {
    public static void kuvaOlek(Voolujuht v){
        if(v.kasJuhib()){
            System.out.println("Juhib");
        }else{
            System.out.println("Ei juhi");
        }
    }
    public static void main(String[] arg){


        //Voolujuht v1 = new
        Lyliti l1 = new Lyliti();
        Lyliti l2 = new Lyliti();
        Lyliti l3 = new Lyliti();
        Lyliti l4 = new Lyliti();


        l1.seisund(false);
        l2.seisund(true);
        l3.seisund(true);
        l4.seisund(false);

        Roopyhendus2 r2= new Roopyhendus2();
        r2.lisa(l1);
        r2.lisa(l2);
        kuvaOlek(r2);

        jada j1 = new jada();
        j1.lisa(l3);
        kuvaOlek(j1);

        HulgiUhendus h1 = new HulgiUhendus();
        h1.lisa(r2);
        h1.lisa(j1);
        System.out.println(h1.hulgiJuht());




    }
}
