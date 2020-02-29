package teste2;

import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
	String nome;
	int telefone;
	int serie;
	double nota1;
	double nota2;
	double nota3;
	double media;
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre com o nome do aluno");
	nome = sc.next();
	System.out.println("telefone do aluno");
	telefone = sc.nextInt();
	System.out.println("serie do aluno");
	serie= sc.nextInt();
	System.out.println("primeira nota");
	nota1 = sc.nextDouble();
	System.out.println("segunda nota");
	nota2 = sc.nextDouble();
	System.out.println("terceira nota");
	nota3 = sc.nextDouble();
	sc.close();
	media = (nota1 +nota2+nota3)/3;		
    System.out.println("Nome: " + nome);
    System.out.println("Telefone: " + telefone);
    System.out.println ("Serie: " + serie);
    System.out.println("Media: " + media);
	}

}
