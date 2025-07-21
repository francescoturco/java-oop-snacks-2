package esercizio2;

public class ContoBancario {
    private double saldo;
    private String numeroConto;

    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }

    public void deposita(double importo) {
        if(importo > 0)
            saldo += importo;
    }

    public boolean preleva(double importo) {
        if(importo > 0 && importo <= saldo) {
            saldo -= importo;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConto() {
        return numeroConto;
    }
}