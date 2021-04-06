package v3;

public class pooraja implements Lylitatav{
    Lylitatav sisu;
    public pooraja(Lylitatav l){sisu = l;}
    public void seisund(boolean sees){
        sisu.seisund(!sees);
    }

}
