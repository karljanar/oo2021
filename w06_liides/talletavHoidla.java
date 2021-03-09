class talletavHoidla implements hoidla{
    int[] arvud;
    int sees = 0;
    public talletavHoidla(int maxKogus){
        arvud = new int[maxKogus];
    }
    public void lisa(int kogus){
        arvud[sees++] = kogus;
    }
    public int kysiSumma(){
        int summa = 0;
        for(int i = 0; i < sees; i++){
            summa += arvud[i];
        }
        return summa;
    }

    public int[] kysiArvud(){
        int[] vastus = new int[sees];
        for(int i = 0; i<sees; i ++){
            vastus[i]=arvud[i];
        }
        return vastus;
    }

}
