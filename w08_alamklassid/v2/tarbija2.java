package v2;

public abstract class tarbija2 {

    public abstract double kysiTakistus();
    public abstract double kysiMaxVoimsus();

    public double kysiVool(double pinge){
        return pinge / kysiTakistus();
    }

    public double kysiMaxPinge(){
        return Math.sqrt(kysiMaxVoimsus() * kysiTakistus());
    }

    public boolean kasLubatudPinge(double pinge){
        if(pinge < kysiMaxPinge()){
            return true;
        }
        return false;
    }

    public boolean kasLubatudVool(double vool){
        double pinge = vool*kysiTakistus();
        return kysiMaxVoimsus()>=pinge*vool;
    }




}

