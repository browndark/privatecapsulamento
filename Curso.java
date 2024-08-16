package Cadastro;

public class Curso {
    private String faculdade;
    private String curso;
    private String periodo;

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }


    public String getPeriodo() {
        return periodo;
    }


    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String toString() {
        return faculdade + ": " + curso + " - " + periodo;
    }
}
