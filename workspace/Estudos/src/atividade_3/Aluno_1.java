package atividade_3;

import javax.swing.JOptionPane;

public class Aluno_1 {
	
	public String nome;
	public String cpf;
	public String endereco;
	
	public Aluno_1(String nome, String cpf, String endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public void ImprimeDados() {
		JOptionPane.showMessageDialog(null, 
				"Nome do aluno: " + this.nome + "\n" +
				"CPF: " + this.cpf + "\n" +
				"Endereco: " + this.endereco + "\n" );
	}
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog( "Informe o nome do aluno: ");
		
		String cpf = JOptionPane.showInputDialog( "Informe o CPF do aluno: ");
		
		String endereco = JOptionPane.showInputDialog( "Informe o endere�o do aluno: ");
		
		Aluno_1 x = new Aluno_1(nome, cpf, endereco);
		
		x.ImprimeDados();
	}
}
