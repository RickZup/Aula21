package ZupRH;

import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private LocalDate dataAdmissao;
    private double salario;
    private int identificador;
    private static int contadorID = 0;

    public Funcionario() {
        setContadorID(getContadorID() + 1);
        setIdentificador(getContadorID());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        if (dataAdmissao.isAfter(LocalDate.now())){
            System.out.println("---------- ATENÇÃO ----------");
            System.out.println("A data inserida para " + getNome() + " está inválida!");
        } else {
            this.dataAdmissao = dataAdmissao;
        }
    }

    public double getSalario() {
        if (salario < 700){
            System.out.println("Salário ivalido! O valor deve ser maior ou igual a R$700,00! Digite novamente");
            salario = 0;
        }
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public static int getContadorID() {
        return contadorID;
    }

    public static void setContadorID(int contadorID) {
        Funcionario.contadorID = contadorID;
    }

    public void exibirDados(){
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("REGISTRO DO FUNCIONÁRIO");
        System.out.println("-------------------------");
        System.out.println("ID do funcionário: " + getIdentificador());
        System.out.println("Nome: " + getNome());
        System.out.println("Data de admissão: " + getDataAdmissao());
        System.out.printf("Salário: %.2f", getSalario());
        System.out.println();
    }

}
