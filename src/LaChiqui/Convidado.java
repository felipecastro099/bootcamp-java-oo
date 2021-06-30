package LaChiqui;

public class Convidado {
    private String nome;

    public Convidado(String nome) {
        this.nome = nome;
    }

    public void comerBolo(){
        System.out.println(this.toString()+" comeu o bolo...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Convidado " + nome;
    }
}
