package maiorDeIdade;

import java.util.Scanner;

public class MaiorDeIdade {

	public static void main(String[] args) {
		// Idade com boolean

		Scanner in = new Scanner(System.in);
		int idade;
		
		System.out.println("Insira sua IDADE: ");
		idade = in.nextInt();
		
		System.out.println((idade >= 18 ? "Você é maior de idade" : "Você NÃO é maior de idade"));
	}

}
