package LaChiqui;

import java.util.ArrayList;
import java.util.List;

public class PacoteFogos extends FogoArtificio {
    private List<FogoArtificio> fogos = new ArrayList<>();

    public PacoteFogos(String[] fogos) {

        for (String barulho: fogos ) {
            this.fogos.add(new FogoArtificio(barulho));
        }

    }

    public PacoteFogos(List<FogoArtificio> fogos) {
        this.fogos = fogos;
    }

    @Override
    public void explodir() {
        fogos.forEach(FogoArtificio::explodir);

    }
}
