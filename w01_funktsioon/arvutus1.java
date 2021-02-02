public class arvutus1 {
    public static double taksoSoit(double k){
        return 3 + (k*0.8);
    }
    public static void main(String[] arg){
        double mass = 73.5;
        System.out.println(mass+10);
        System.out.println(mass*2);
        System.out.println(mass/2);
        int vanus = 7;
        String eesnimi = "Juku";
        if(vanus < 7){
            System.out.println("tasuta");
        } else {
            System.out.println(eesnimi + ", osta pilet");
        }
        long molekule=7948498498448L;
        System.out.println(molekule % 1000);
        short palk=25000;
        short kogupalk=(short)(palk*(short)2);
        System.out.println(kogupalk);
        byte loendur=20;
        float vahemaa=100.25f;
        //char symbol = "x";
        boolean kasKorras=false;
        System.out.println(taksoSoit(Double.parseDouble(arg[0])));
        //byte, short, int, long
        //float, double
        //char
        //boolean
    }
}