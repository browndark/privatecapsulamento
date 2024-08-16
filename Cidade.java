package Cadastro;

public class Cidade {
    private String cidade;
    private String uf;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }



    public String toString() {
        return cidade + " - " + uf;
    }
}


