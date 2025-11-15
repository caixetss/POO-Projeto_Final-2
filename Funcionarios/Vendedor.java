public class Vendedor extends Funcionario {
    @Override
    public int calcularSalario() {
        int salarioBase = getSalarioBase();
        int comissao = getComissao();
        return salarioBase + comissao; // Adiciona comissão ao salário base
    }
}
