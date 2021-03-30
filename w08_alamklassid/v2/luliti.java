package v2;

public class luliti extends tarbija2 implements lylitatav{
    boolean yhendatud;
    public void seisund(boolean sees){
        yhendatud=sees;
    }
    public double kysiTakistus(){
        if(yhendatud){return 0.0001;}
        return 1000000;
    }

    public double kysiMaxVoimsus() {
        return 3;
    }


}
