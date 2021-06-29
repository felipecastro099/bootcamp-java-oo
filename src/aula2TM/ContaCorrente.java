package aula2TM;

public class ContaCorrente {
    private Double saldo;
    private Integer numero;

    public ContaCorrente(ContaCorrente conta) {
        this.saldo = conta.getSaldo();
        this.numero = conta.getNumero();
    }

    public ContaCorrente(Double saldo, Integer numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void deposito(Double valor) {
        this.saldo += valor;
    }

    public void saque(Double valor) {
        int podeTransferir = valor.compareTo(this.saldo);

        if (podeTransferir <= 0) {
            this.saldo =- valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Deu errado!");
        }
    }

    public void devolucao(Double valor) {
        this.saldo += valor;
        System.out.println("Devolução feita!");
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }
}
