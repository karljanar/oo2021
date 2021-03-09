public class stringiEsitaja implements tekstistEraldaja{
    String sisu;
    public stringiEsitaja(String sisu){
        this.sisu = sisu;
    }

    public String eralda(String s){
        return sisu;
    }
}
