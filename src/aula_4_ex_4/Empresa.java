package aula_4_ex_4;

import java.math.BigDecimal;

public class Empresa {
    private String nome;
    private BigDecimal lucro;

    public Empresa(String nome, BigDecimal lucro) {
        this.nome = nome;
        this.lucro = lucro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getLucro() {
        return lucro;
    }

    public void setLucro(BigDecimal lucro) {
        this.lucro = lucro;
    }
}
