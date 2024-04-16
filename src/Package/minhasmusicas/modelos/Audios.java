package Package.minhasmusicas.modelos;

public class Audios {

    private String titulo;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }


    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }


    public int getClassificacao() {
        return classificacao;
    }


    public void curtir() {
        this.totalDeCurtidas++;
    }

    public void reproduz() {
        this.totalDeReproducoes++;
    }
}

