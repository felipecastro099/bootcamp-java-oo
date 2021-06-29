package dakar;

public class Main {
    public static void main(String[] args) {
        SocorristaCarro socorristaCarro = new SocorristaCarro(200, 3.0, 4, "ABC123");
        SocorristaMoto socorristaMoto = new SocorristaMoto(200, 3.0, 4, "DEF123");

        Corrida corrida = new Corrida(13.0, 100.5, "Corrida", 6, socorristaMoto, socorristaCarro);

        corrida.registrarCarro(200, 10.0, 3, "FEL123");
        corrida.registrarMoto(200, 10.0, 2, "CAST12");
        corrida.registrarMoto(210, 10.5, 4, "MELI12");

        Veiculo veiculo = corrida.vencedor();
        System.out.println(veiculo);

        corrida.removerVeiculoPorPlaca("MELI12");
        corrida.socorrerCarro("FEL123");
        corrida.socorrerMoto("CAST12");
    }
}
