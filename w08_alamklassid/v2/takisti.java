package v2;

public class takisti extends tarbija2{
    double r, maxN;
    public takisti(double r, double maxN){
        this.r = r;
        this.maxN = maxN;
    }
    public double kysiTakistus(){
        return r;
    }
    public double kysiMaxVoimsus(){
        return maxN;
    }
}
