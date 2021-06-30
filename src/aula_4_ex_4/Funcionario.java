package aula_4_ex_4;

import java.math.BigDecimal;

public class Funcionario implements Pagamento{
    private String nome;
    private Cargo cargo;
    private TipoCargo tipoCargo;
    private BigDecimal salarioBase;
    private Empresa empresa;
    private Integer metasBatidas;
    private Double bonificacao;

    public Funcionario(String nome, Cargo cargo, TipoCargo tipoCargo, BigDecimal salarioBase, Empresa empresa, Integer metasBatidas, Double bonificacao) {
        this.nome = nome;
        this.cargo = cargo;
        this.tipoCargo = tipoCargo;
        this.salarioBase = salarioBase;
        this.empresa = empresa;
        this.metasBatidas = metasBatidas;
        this.bonificacao = bonificacao;
    }

    public Double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }


    public Integer getMetasBatidas() {
        return metasBatidas;
    }

    public void setMetasBatidas(Integer metasBatidas) {
        this.metasBatidas = metasBatidas;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public TipoCargo getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(TipoCargo tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public BigDecimal pagarSalario() {
        if (this.cargo == Cargo.DIRETOR) {
            if (this.tipoCargo == TipoCargo.CLT) {
                double valor = this.salarioBase.doubleValue() + (this.empresa.getLucro().doubleValue() * this.bonificacao);
                return BigDecimal.valueOf(valor);
            }

            return this.salarioBase;
        }

        if (this.cargo == Cargo.GERENTE || this.cargo == Cargo.ANALISTA || this.cargo == Cargo.TECNICO) {
            if (this.tipoCargo == TipoCargo.CLT) {
                double valor = this.salarioBase.doubleValue() + (this.metasBatidas * this.bonificacao * this.salarioBase.doubleValue());
                return BigDecimal.valueOf(valor);
            }

            return this.salarioBase;
        }

        return null;
    }
}
