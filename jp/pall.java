public class pall {
    liikuvObjekt lobj;
    double aeglustuskoef;

    public pall(double x, double y, double dx, double dy, double akoef){
        lobj=new liikuvObjekt(x,y,dx,dy);
        aeglustuskoef=akoef;
    }

    public void liigu(double sek){
        lobj.liigu(sek);
        lobj.kiirus = lobj.kiirus.korruta(Math.pow(aeglustuskoef, sek));
    }

    public double kaugus(liikuvObjekt obj){
        Vektor asukoht1 = this.lobj.asukoht;
        Vektor asukoht2 = obj.asukoht;
        double dx = asukoht1.x - asukoht2.x;
        double dy = asukoht1.y - asukoht2.y;

        return Math.sqrt(dx*dx+dy*dy);
    }

    public String toString(){
        return "Pall " + aeglustuskoef + " " + lobj;
    }
}
