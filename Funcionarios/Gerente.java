public class Gerente extends Funcionario {
    @Override
    public int calcularSalario() {
        int salarioBase = getSalarioBase();
        return salarioBase + 2000; // Adiciona 2k ao salario base
    }
    
}
