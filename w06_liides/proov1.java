public class proov1 {
    public static void main(String[] arg){
        hoidla h = new LihtneHoidla();
        for (int i =0; i<arg.length; i++){
            h.lisa(Integer.parseInt(arg[i]));
        }
        System.out.println(h.kysiSumma());
    }
}
