package dakar;

public class Carro extends Veiculo {
    public Carro(Integer velocidade, Double aceleracao, Integer anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, 1000.0, 4);
    }
}
