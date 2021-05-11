public class funktsioonid1 {

    public static double taksoSoit(double k){
        return 3 + (k*0.8);
    }
    public static double ringiPindala(double r){
        return Math.PI*r*r;
    }
    public static String temperatuuriHinnang(int t){
        if(t<18){
            return "Kulm";
        } else {
            return "Soe";
        }
    }

}