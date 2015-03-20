package atividade_3;

import javax.swing.JOptionPane;

public class Aluno_2 {
	public String nome;
	public double nota1;
	public double nota2;
	
	public Aluno_2(String nome, double nota1, double nota2) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public void imprimeDados() {
		JOptionPane.showMessageDialog( null, 
				"Nome do aluno: " + this.nome + "\n" +
				"Nota N1: " + this.nota1 + "\n" +
				"Nota N2: " + this.nota2 + "\n" );
	}
	
	public double retornaMedia() {
		return (this.nota1 + this.nota2)/2;
	}
	
	public void ImprimeMedia() {
		JOptionPane.showMessageDialog( null, 
				"Media do aluno: " + this.retornaMedia());
	}
	
	public void imprimeResultado() {
		String resultado;
		
		if (this.retornaMedia() >= 6.0 ) resultado = "Aprovado...";
		else resultado = "Reprovado...";
		
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
	}
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
		String N1 = JOptionPane.showInputDialog("Informe a nota N1 do aluno: ");
		String N2 = JOptionPane.showInputDialog("Informe a nota N2 do aluno: ");
		
		if (nome == null | N1 == null | N2 == null ) {
			System.out.println("Fim anormal de programa. Dados não informados corretamente");
			return;
		}
		
		double n1 = Double.parseDouble(N1);
		double n2 = Double.parseDouble(N2);
		
		Aluno_2 x = new Aluno_2(nome, n1, n2);
		
		x.imprimeDados();
		x.ImprimeMedia();
		x.imprimeResultado();
		
		System.out.println("Fim de prorama...");
	}
}
