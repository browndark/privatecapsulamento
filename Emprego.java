package Cadastro;

public class Emprego {
    private String cargo;
    private String empresa;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String toString() {
        return empresa + " - " + cargo;
    }
}

