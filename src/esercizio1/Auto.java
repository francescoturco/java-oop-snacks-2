package esercizio1;


public class Auto extends Veicolo {
    private int numeroPorte;

    public Auto(String marca, int anno, int numeroPorte) {
        super(marca, anno);
        this.numeroPorte = numeroPorte;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }
    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    @Override
    public void stampaInfo() {
        System.out.println("Auto: Marca = " + getMarca() + ", Anno = " + getAnno() + ", Porte = " + numeroPorte);
    }
}
