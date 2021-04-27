public class Hammasratas {
    double poorded = 0;
    int hrattahambad;

    public double liiguEdasi(int hambad){
        hrattahambad = hambad;
        poorded += 1D/hambad;
        poorded = Math.round(poorded *100) /100D;
        return poorded;
    }

    public int kysiHambaid(){
        return hrattahambad;
    }
}
