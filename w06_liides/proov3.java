public class proov3 {
    public static void main(String[] arg){
        hoidla h = new talletavHoidla(5);
        //hoidla h = new LihtneHoidla();
        for (int i =0; i<arg.length; i++){
            h.lisa(Integer.parseInt(arg[i]));
        }
        System.out.println(h.kysiSumma());
        if(h instanceof talletavHoidla){
            talletavHoidla th = (talletavHoidla)h;
            if(th.kysiArvud().length>0){
                System.out.println("esimene arv oli " + th.kysiArvud()[0]);
            }
        }
    }
}
