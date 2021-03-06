/* CLASSE Aluno */
package atividade_2;

public class Aluno {
	String nome;
	int codmat;
	String cpf;
	char sexo;
	float nota_P1;
	float nota_P2;
	
	Aluno(String nome, int codmat, String cpf, char sexo, float nota_P1, float nota_P2) {
		super();
		this.nome = nome;
		this.codmat = codmat;
		this.cpf = cpf;
		this.sexo = sexo;
		this.nota_P1 = nota_P1;
		this.nota_P2 = nota_P2;
	}
	
	Aluno(){
		this.nome = null;
		this.codmat = 0;
		this.cpf = null;
		this.sexo = ' ';
		this.nota_P1 = 0;
		this.nota_P2 = 0;
	}
	
	public void Imprime_Aluno() {
		System.out.println("***** Funcao Imprime_Aluno() ******");
		System.out.println("Nome = " + nome);
		System.out.println("Codigo de Matricula = " + codmat);
		System.out.println("CPF = " + cpf);
		System.out.println("Sexo = " + sexo);
		System.out.println("Nota P1 = " + nota_P1);
		System.out.println("Nota P2 = " + nota_P2);
		System.out.println("-------------------------------------------------------\n");
	}
	
	public void Imprime_Sexo() {
		System.out.println("***** Funcao Imprime_Sexo() *****");
		System.out.println("Nome = " + nome);
		if (this.sexo == 'M')
			System.out.println("Masculino...");
		else System.out.println("Feminino...");
		System.out.println("-------------------------------------------------------\n");
	}
	
	public float Media_Aluno() {
		System.out.println("***** Funcao Media_Aluno() *****");
		return ( ( nota_P1 + nota_P2)/ 2 );
	}
	
	public String Resultado() {
		System.out.println("***** Funcao Resultado() *****");
		if (Media_Aluno() >= 7.0) return ("Aprovado");
		else if (Media_Aluno() < 3.0) return ("Reprovado");
		else return("Exame");
	}
}
