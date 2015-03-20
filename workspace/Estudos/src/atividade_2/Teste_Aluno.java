/* CLASSE Teste_Aluno */
package atividade_2;

public class Teste_Aluno {
	
	public static void main(String[] args) {
		Aluno X1 = new Aluno("Paulo", 55123, "800912345-12", 'M',7.0F, 6.0F);
		Aluno X2 = new Aluno();
		X2.nome = "Ana";
		X2.codmat = 67125;
		X2.cpf = "650891756-55";
		X2.sexo = 'F';
		X2.nota_P1 = 5.0F;
		X2.nota_P2 = 9.0F;
		
		X1.Imprime_Aluno();
		X1.Imprime_Sexo();
		System.out.println("Media: " + X1.Media_Aluno());
		System.out.println("Resultado: " + X1.Resultado());
		System.out.println("-------------------------------------------------------\n");
		
		X2.Imprime_Aluno();
		X2.Imprime_Sexo();
		System.out.println("Media: " + X2.Media_Aluno());
		System.out.println("Resultado: " + X2.Resultado());
		System.out.println("-------------------------------------------------------\n");
	}
}
