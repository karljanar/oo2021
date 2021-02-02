public class funktsioonid1 {
    //taksosoidu hinna
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
    public static void main(String[] arg){
        System.out.println(ringiPindala(5));
        if(arg.length==1){
            //System.out.println(temperatuuriHinnang(Integer.parseInt(arg[0])));
        }
        System.out.println(taksoSoit(Double.parseDouble(arg[0])));

    }
}