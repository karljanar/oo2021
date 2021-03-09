/*
 * Hoidla liidest realiseeriv klass peab suutma oma
 * eksemplari sees hoida lisatavatest täisarvudest
 * moodustunud summat ning küsimise peale seda väljastama.
 */
interface hoidla{


     /*
     * Olemasolevatele andmetele koguse jagu elementide lisamine
     */
    void lisa(int kogus);
     /*
     * Hetkel meeles peetava koguse tagastamine
     */
    int kysiSumma();
}