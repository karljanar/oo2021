package tarbija;

public class tarbija {
    double r, maxN;
    public tarbija(double r, double maxN){
        this.r = r;
        this.maxN = maxN;
    }
    public double kysiTakistus(){
        return r;
    }

    public double kysiMaxVoimsus(){
        return maxN;
    }

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
