public class Hammasratas {
    double poorded = 0;

    public double liiguEdasi(int hambad){
        if(hambad < 10){
            hambad = 10;
        }
        poorded += hambad / 100D;
        poorded = Math.round(poorded *100) /100D;
        return poorded;
    }

    /*public boolean kysiPooret(){
        return poorded % 2 == 0 || poorded % 2 == 1;
    }*/
}
