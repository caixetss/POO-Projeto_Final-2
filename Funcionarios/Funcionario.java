public class Funcionario {
     // Atributos
    private String nome;
    private int cpf;
    private int salarioBase; // salario base = 3k
    private int comissao = 500; // comissao = 500

    //Construtor

    public Funcionario(){

    }
    
    // Getters e Setters

    // Getter e Setter para Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    // Getter e Setter para CPF
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

   
    // Getter e Setter para Salario Base
    public int getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Getter e Setter para Comissão
    public int getComissao() {
        return comissao;
    }
    public void setComissao(int comissao) {
        this.comissao = comissao;
    }
   
    // Métodos

    public int calcularSalario() {
        return salarioBase;
    }

    public String mostrarInfo() {
        return "Informações do funcionário:";
    }

}