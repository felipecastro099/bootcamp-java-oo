package LaChiqui;

public class ConvidadoMeli extends Convidado {
    private String nome;

    public ConvidadoMeli(String nome) {
        super(nome);
        this.nome = nome;
    }

    @Override
    public void comerBolo() {
        super.comerBolo();
        System.out.println(this.toString()+" grita: Viva La Chiqui !!!");
    }
}
