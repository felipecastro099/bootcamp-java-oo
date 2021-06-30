package LaChiqui;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Convidado> convidados = new ArrayList<>();
        String[] aConvidados = {"Felipe", "Andre", "Carlos", "Gustavo", "Renam"};

        for (int i = 0; i < aConvidados.length; i++) {

            if(i%2 == 0)
                convidados.add(new ConvidadoMeli(aConvidados[i]));
            else
                convidados.add(new Convidado(aConvidados[i]));

        }

        List<FogoArtificio> fogos = new ArrayList<>();
        List<FogoArtificio> fogosAUX = new ArrayList<>();

        fogosAUX.add(new PacoteFogos(new String[]{ "PÁ!!!","RRAA TA TA TA!!!" }));
        fogosAUX.add(new FogoArtificio("ssssssssSHHHHHH TÁ!!!"));
        fogosAUX.add(new FogoArtificio("BA DUM TSS!"));

        fogos.add(new FogoArtificio("KABOOM!!!"));
        fogos.add(new PacoteFogos( new String[]{ "KABOOM!!!","BOOM!!!" } ));
        fogos.add(new FogoArtificio("TRAA!!!"));
        fogos.add(new PacoteFogos(fogosAUX));

        PacoteFogos pack = new PacoteFogos(fogos);


        System.out.println("Degustação do bolo:");
        convidados.forEach(Convidado::comerBolo);


        System.out.println("\n\nShow de fogos:");
        pack.explodir();


    }
}
