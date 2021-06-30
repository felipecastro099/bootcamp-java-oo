package aula_5_ex_1;

public class Celular implements Precedente<Celular> {
    private String holder;
    private String number;

    public Celular(String holder, String number) {
        this.number = number;
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public int precede(Celular celular) {
        return this.number.compareTo(celular.getNumber());
    }

    @Override
    public String toString() {
        return "Celular{" +
                "holder='" + holder + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
