package v3;

public class Lyliti implements Lylitatav, Voolujuht{
    boolean yhendatud;
    public void seisund(boolean sees){
        yhendatud=sees;
    }
    public boolean kasJuhib(){return yhendatud;}
}
