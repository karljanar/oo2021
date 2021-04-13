public  class paar <T, U>{
    T esimene;
    U teine;
    public paar(T e, U t){
        esimene = e;
        teine = t;
    }

    public String toString(){
        return esimene + " - " + teine;
    }

    @Override
    public boolean equals(Object vorreldav){
        if(!(vorreldav instanceof paar)){
            return false;
        }
        return esimene.equals(((paar<?, ?>) vorreldav).esimene) && teine.equals(((paar<?, ?>) vorreldav).teine);
    }

    @Override
    public int hashCode(){
        return (int) esimene.hashCode()* teine.hashCode();
    }
}
