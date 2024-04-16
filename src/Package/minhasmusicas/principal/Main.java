package Package.minhasmusicas.principal;

import Package.minhasmusicas.modelos.MinhasPreferidas;
import Package.minhasmusicas.modelos.Musicas;
import Package.minhasmusicas.modelos.Podcasts;

public class Main {
    public static void main(String[] args) {

        Musicas musica_1 = new Musicas();
        musica_1.setTitulo("Cara esperto");
        musica_1.setArtista("Forfun");

        for (int i = 0; i < 1000; i++) {
            musica_1.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica_1.curtir();
        }

        Podcasts podcast_1 = new Podcasts();
        podcast_1.setTitulo("Flow");
        podcast_1.setHost("Igor 3k");

        for (int i = 0; i < 5000; i++) {
            podcast_1.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast_1.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast_1);
        preferidas.inclui(musica_1);


    }
}