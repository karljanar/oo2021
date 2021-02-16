public class proov2 {
    public static void main(String[] arg){
        liikuvObjekt o1 = new liikuvObjekt(4, 3, 2, 1);
        liikuvObjekt o2 = new liikuvObjekt(2, 2);
        System.out.println(o1 + " " + o2);
        o1.liigu();
        //o2.liigu();
        System.out.println(o1 + " " + o2);
        pall p1 = new pall(5, 5, 1, 1, 0.8);
        //p1.liigu(2);
        System.out.println(p1);
        System.out.println("Obj2 " + o2);

        System.out.println(p1.kaugus(o2));
    }
}
