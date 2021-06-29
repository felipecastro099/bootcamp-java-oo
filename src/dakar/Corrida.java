package dakar;

import java.util.ArrayList;
import java.util.List;

public class Corrida {
    private Double distancia;
    private Double premioEmDolares;
    private String nome;
    private Integer quantidadeVeiculosPermitidos;
    private List<Veiculo> veiculos;
    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;

    public Corrida(Double distancia, Double premioEmDolares, String nome, Integer quantidadeVeiculosPermitidos, SocorristaMoto socorristaMoto, SocorristaCarro socorristaCarro) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.socorristaCarro = socorristaCarro;
        this.socorristaMoto = socorristaMoto;
        this.veiculos = new ArrayList<>();
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getPremioEmDolares() {
        return premioEmDolares;
    }

    public void setPremioEmDolares(Double premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeVeiculosPermitidos() {
        return quantidadeVeiculosPermitidos;
    }

    public void setQuantidadeVeiculosPermitidos(Integer quantidadeVeiculosPermitidos) {
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public SocorristaCarro getSocorristaCarro() {
        return socorristaCarro;
    }

    public void setSocorristaCarro(SocorristaCarro socorristaCarro) {
        this.socorristaCarro = socorristaCarro;
    }

    public SocorristaMoto getSocorristaMoto() {
        return socorristaMoto;
    }

    public void setSocorristaMoto(SocorristaMoto socorristaMoto) {
        this.socorristaMoto = socorristaMoto;
    }

    public void registrarCarro(Integer velocidade, Double aceleracao, Integer anguloDeGiro, String placa) {
        if (this.veiculos.size() < this.quantidadeVeiculosPermitidos) {
            this.veiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
        }
    }

    public void registrarMoto(Integer velocidade, Double aceleracao, Integer anguloDeGiro, String placa) {
        if (this.veiculos.size() < this.quantidadeVeiculosPermitidos) {
            this.veiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        this.veiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa) {
        int indexPlaca = findPlaca(placa);

        if (indexPlaca != -1) {
            this.veiculos.remove(indexPlaca);
        }
    }

    public Veiculo vencedor() {
        Veiculo vencedor = null;
        Double valorAnterior = 0.0;

        for (Veiculo veiculo : this.veiculos) {
            double valor = (veiculo.getVelocidade() * veiculo.getAceleracao() / (veiculo.getAnguloDeGiro()) * (veiculo.getPeso() - veiculo.getRodas() * 100));
            if (valor > valorAnterior) {
                vencedor = veiculo;
            }
            valorAnterior = valor;
        }
        
        return vencedor;
    }

    public void socorrerMoto(String placa) {
        int index = findPlaca(placa);

        if (index != -1) {
            this.socorristaMoto.socorrer((Moto) this.veiculos.get(index));
        }
    }

    public void socorrerCarro(String placa) {
        int index = findPlaca(placa);

        if (index != -1) {
            this.socorristaCarro.socorrer((Carro) this.veiculos.get(index));
        }
    }

    public int findPlaca(String placa) {
        int indexPlaca = -1;

        for (int i = 0; i < this.veiculos.size(); i++) {
            if(this.veiculos.get(i).getPlaca().equals(placa)) {
                indexPlaca = i;
            }
        }

        return indexPlaca;
    }
}
