package ZupRH;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        //---------- Dev Assistente ----------//

        Funcionario devAssistente = new Funcionario();
        devAssistente.setNome("Henrique dos Santos");
        devAssistente.setDataAdmissao(LocalDate.parse("2023-10-02"));
        devAssistente.setSalario(2000);
        devAssistente.exibirDados();

        //---------- Dev Junior ----------//

        Funcionario devJunior = new Funcionario();
        devJunior.setNome("Hugo Drummond");
        devJunior.setDataAdmissao(LocalDate.parse("2022-09-01"));
        devJunior.setSalario(1000);
        devJunior.exibirDados();

        //---------- Dev Pleno ----------//

        Funcionario devPleno = new Funcionario();
        devPleno.setNome("Carol Carvalho");
        devPleno.setDataAdmissao(LocalDate.parse("2021-03-01"));
        devPleno.setSalario(600);
        devPleno.exibirDados();
    }
}
