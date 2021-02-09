public class proov3 {
    public static void main(String[] arg){
        retsept pannkoogid = new retsept();
        pannkoogid.lisa("piim", 500.0);
        pannkoogid.lisa("jahu", 250.0);
        pannkoogid.lisa("muna", 50);

        System.out.println(pannkoogid.kysiAined());
        System.out.println(pannkoogid.koguMass());
        retsept paljuPannkooke = pannkoogid.koopia(3);
        System.out.println(paljuPannkooke.kysiAine());
        retsept pannkook = pannkoogid.soovitudMassigaKoopia(500);
        System.out.println(pannkook.kysiAine());

    }
}
