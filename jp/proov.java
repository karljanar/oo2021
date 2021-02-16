public class proov{
    public static void main(String[] arg){
        Vektor v1=new Vektor(2, 5);
        Vektor v2=new Vektor(1, 1);
        System.out.println(v1.x);
        System.out.println(v1.korruta(0.5).y);
        v1.liidaJuurde(v2);
        System.out.println(v1.x);

        Vektor v3=v2.korruta(0.5);
        v1.liidaJuurde(v3);
        System.out.println(v1.x);

        liikuvObjekt lOBJ1 = new liikuvObjekt(3, 4);
        liikuvObjekt lOBJ2 = new liikuvObjekt(1, 1, 1, 1);
        System.out.println("Algseis obj1: " + lOBJ1.toString());
        System.out.println("Algseis obj2: " + lOBJ2.toString());
        lOBJ1.kiirus = new Vektor(2, 2);
        lOBJ1.liigu(2);
        lOBJ2.liigu(2);
        System.out.println("seis obj1: " + lOBJ1.toString());
        System.out.println("seis obj2: " + lOBJ2.toString());

    }
}