public class Main {
    public static void main(String[] args) {

        // Objeto Gerente
        Gerente gerente = new Gerente();

        System.out.println(gerente.mostrarInfo());

        gerente.setNome("Carlos Silva");
        System.out.println("Nome do Gerente: " + gerente.getNome());

        gerente.setCpf(123456789);
        System.out.println("CPF do Gerente: " + gerente.getCpf());

        gerente.setSalarioBase(3000);
        System.out.println("Salario do Gerente: R$" + gerente.calcularSalario());


        // Objeto Vendedor
        Vendedor vendedor = new Vendedor();

        System.out.println(vendedor.mostrarInfo());

        vendedor.setNome("Ana Souza");
        System.out.println("Nome do Vendedor: " + vendedor.getNome());

        vendedor.setCpf(123654789);
        System.out.println("CPF do Vendedor: " + vendedor.getCpf());

        vendedor.setSalarioBase(3000);
        System.out.println("Salario do Vendedor: R$" + vendedor.calcularSalario());

    }
    
}
