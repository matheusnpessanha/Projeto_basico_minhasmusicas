package Package.minhasmusicas.modelos;

public class Musicas extends Audios {

    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeReproducoes() >= 2000) {
            return 5;
        } else if (getTotalDeReproducoes() < 2000 && getTotalDeReproducoes() >= 1500) {
            return 3;
        } else {
            return 1;
        }
    }
}
