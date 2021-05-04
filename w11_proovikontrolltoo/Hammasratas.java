public class Hammasratas {
    double poorded = 0;
    int hrattahambad;

    public double liiguEdasi(int hambad, double poore){
        hrattahambad = hambad;
        poorded += 1D/hambad * poore;
       // poorded = Math.round(poorded *100) /100D;
        return poorded;
    }


    //ei toota
    public double kysiPoore(){
        return poorded;
    }
}
