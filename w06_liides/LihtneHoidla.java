class LihtneHoidla implements hoidla{
    int hetkeSumma = 0;
    public void lisa(int kogus){hetkeSumma += kogus;}
    public int kysiSumma(){return hetkeSumma;}
}
