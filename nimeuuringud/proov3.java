public class proov3 {
    public static void main(String[] arg){
        eraldusteYhendaja initsiaalid = new eraldusteYhendaja();
        initsiaalid.lisa(new eraldaja());
        initsiaalid.lisa(new stringiEsitaja("."));
        sonaEraldaja se = new sonaEraldaja(2);
        eraldusteJarjestKaiv perekonnaN = new eraldusteJarjestKaiv();
        perekonnaN.lisa(new sonaEraldaja(2));
        perekonnaN.lisa(new eraldaja());
        initsiaalid.lisa(perekonnaN);
        initsiaalid.lisa(new stringiEsitaja("."));
        System.out.println(initsiaalid.eralda("Juku Kaalikas"));
    }
}
