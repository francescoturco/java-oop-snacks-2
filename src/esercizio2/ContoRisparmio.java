package esercizio2;

public class ContoRisparmio extends ContoBancario {
    private double tassoInteresse; 

    public ContoRisparmio(String numeroConto, double tassoInteresse) {
        super(numeroConto);
        this.tassoInteresse = tassoInteresse;
    }

    public void applicaInteressi() {
        double interessi = getSaldo() * tassoInteresse;
        deposita(interessi);
    }

    public double getTassoInteresse() {
        return tassoInteresse;
    }
}