package v3;

public class jada extends HulgiUhendus{
    Boolean juhtivus;
    public boolean kasJuhib(){

        for(Voolujuht v: hoidla){
            if(!v.kasJuhib()){
                return  false;
            }
        }
        return true;
    };
}
