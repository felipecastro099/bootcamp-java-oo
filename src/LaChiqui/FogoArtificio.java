package LaChiqui;

public class FogoArtificio {
    private String barulho;

    public FogoArtificio() {
    }

    public FogoArtificio(String barulho) {
        this.barulho = barulho;
    }

    public String getBarulho() {
        return barulho;
    }

    public void setBarulho(String barulho) {
        this.barulho = barulho;
    }

    public void explodir(){
        System.out.println(barulho);
    }
}
