Trabalho 02

Objetivo

Criar um sistema em Java para cadastrar e gerenciar funcionários de uma empresa, aplicando os conceitos de Programação Orientada a Objetos.

Descrição

O sistema deve permitir cadastrar diferentes tipos de funcionários e exibir seus dados e salários, utilizando herança e polimorfismo.
Requisitos obrigatórios
1.	Classe base:
Funcionario
o	Atributos privados: nome, cpf, salarioBase.
o	Construtor para inicializar os atributos.
o	Métodos públicos calcularSalario() e mostrarInfo().


2.	Subclasses:
o	Gerente e Vendedor que herdam de Funcionario.
o	Cada uma deve sobrescrever calcularSalario() de forma diferente:
	Gerente: salário = salárioBase + 2000
	Vendedor: salário = salárioBase + comissão

3.	Encapsulamento:
o	Todos os atributos devem ser privados, com getters e setters.

4.	Modificadores de acesso:
o	Métodos públicos, atributos privados.

5.	Classe principal (Main):
o	Crie objetos de cada tipo de funcionário.
o	Chame calcularSalario() e mostrarInfo() para cada um.

