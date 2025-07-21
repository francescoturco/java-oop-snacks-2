package esercizio2;

public class MainEs2 {
    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario("IT123456");
        conto.deposita(1000);
        conto.preleva(200);
        System.out.println("Saldo ContoBase: " + conto.getSaldo());

        ContoRisparmio contoRisparmio = new ContoRisparmio("IT654321", 0.05);
        contoRisparmio.deposita(1000);
        contoRisparmio.applicaInteressi();
        System.out.println("Saldo ContoRisparmio: " + contoRisparmio.getSaldo());


    }
}
