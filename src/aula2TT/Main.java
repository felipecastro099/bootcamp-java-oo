package aula2TT;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Mercado Livre", BigDecimal.valueOf(1000000000));

        Funcionario tecnicoCLT = new Funcionario("Felipe", Cargo.TECNICO, TipoCargo.CLT, BigDecimal.valueOf(3200), empresa, 10, 0.03);
        Funcionario tecnicoPJ = new Funcionario("Felipe", Cargo.TECNICO, TipoCargo.PJ, BigDecimal.valueOf(3200), empresa, 10, 0.03);

        Funcionario analistaCLT = new Funcionario("Felipe", Cargo.ANALISTA, TipoCargo.CLT, BigDecimal.valueOf(4000), empresa, 10, 0.08);
        Funcionario analistaPJ = new Funcionario("Felipe", Cargo.ANALISTA, TipoCargo.PJ, BigDecimal.valueOf(4000), empresa, 10, 0.08);

        Funcionario gerenteCLT = new Funcionario("Felipe", Cargo.GERENTE, TipoCargo.CLT, BigDecimal.valueOf(6000), empresa, 10, 0.125);
        Funcionario gerentePJ = new Funcionario("Felipe", Cargo.GERENTE, TipoCargo.PJ, BigDecimal.valueOf(6000), empresa, 10, 0.125);

        Funcionario diretorCLT = new Funcionario("Felipe", Cargo.DIRETOR, TipoCargo.CLT, BigDecimal.valueOf(15000), empresa, 10, 0.3);
        Funcionario diretorPJ = new Funcionario("Felipe", Cargo.DIRETOR, TipoCargo.PJ, BigDecimal.valueOf(15000), empresa, 10, 0.3);

        System.out.println(diretorCLT.pagarSalario());
    }
}
