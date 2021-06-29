package aula2TM;

public class Counter {
    Integer valor;

    public Counter(Counter counter) {
        clone(counter);
    }

    public Counter(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public void clone(Counter counter) {
        this.valor = counter.getValor();
    }

    public void aumentar() {
        this.valor++;
    }

    public void aumentar(Integer value) {
        this.valor += value;
    }

    public void diminuir() {
        this.valor--;
    }

    public void diminuir(Integer value) {
        this.valor -= value;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "valor=" + valor +
                '}';
    }
}
