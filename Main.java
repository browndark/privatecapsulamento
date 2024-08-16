import Cadastro.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Cadastro de Aluno =========");

        Aluno aluno = new Aluno();
        aluno.setNome("Bruno de Castro");
        aluno.setCpf("1111111111");
        aluno.setFone("62999999999");

        Endereco endereco = new Endereco();
        endereco.setRua("Av Perimentral");
        endereco.setComplemento("qd R13");
        endereco.setSetor("Setor Coimbra");
        endereco.setCep("74250090");

        Cidade cidade = new Cidade();
        cidade.setCidade("Goiânia");
        cidade.setUf("GO");

        endereco.setCidade(cidade);

        aluno.setEndereco(endereco);

        Curso curso = new Curso();
        curso.setFaculdade("UNIFAN");
        curso.setCurso("Engenharia de Software");
        curso.setPeriodo("3º Período");

        aluno.setCurso(curso);

        Emprego emprego = new Emprego();
        emprego.setEmpresa("Eletrônica Castro");
        emprego.setCargo("Web Programmer");

        aluno.setEmprego(emprego);

        System.out.println("@brunoccs100");
        System.out.println(aluno.toString());
    }
}

