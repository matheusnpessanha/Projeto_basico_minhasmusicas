package Package.minhasmusicas.modelos;

public class Podcasts extends Audios {

    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeCurtidas() >= 5000) {
            return 5;
        } else if (getTotalDeCurtidas() < 5000 && getTotalDeCurtidas() >= 3500) {
            return 3;
        } else {
            return 1;
        }
    }




}
