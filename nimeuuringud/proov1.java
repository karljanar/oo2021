public class proov1 {
    public static void main(String[] arg){
        tekstistEraldaja e = new eraldaja();
        System.out.println(e.eralda(arg[0]));

        tekstistEraldaja te = new sonaEraldaja(1);
        String lause = "";
        for(int i=0; i< arg.length; i++){
            lause += arg[i] + " ";
        }
        System.out.println(te.eralda(lause));

        tekstistEraldaja te2 = new sonaEraldaja(2);
        System.out.println(te2.eralda(lause));

        tekstistEraldaja eP = new sonaEraldaja(arg.length);
        System.out.println(e.eralda(arg[0]) + " " +eP.eralda(lause));




    }
}