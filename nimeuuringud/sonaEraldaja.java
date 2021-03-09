public class sonaEraldaja implements tekstistEraldaja{
    int asukoht = 0;
    public sonaEraldaja(int sonaNr){
        asukoht = sonaNr - 1;
    }
    public String eralda(String s){
        String lause[] = s.split(" ");
        String tSona = lause[asukoht];
        return tSona;
    }
}
