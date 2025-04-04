package classsix2;

import java.util.Scanner;

public class secondtimeusingif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// fazer um algoritmo para classificar em categorias
		//idade					categoria
		//5 até 7 anos			Infantil A
		//8 a 10 anos			Infantil B
		//11 até 13 anos		Juvenil A
		//14 até 17 anos		Juvenil B
		//Maior de 17 anos		Adulto
		
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a idade do atleta: ");
		int idade = scanner.nextInt();
		
		if (idade >= 5 && idade <= 7) {
			System.out.println("Categoria Infantil A");
		} else if(idade >= 8 && idade <= 10) {
			System.out.println("Categoria Infantil B");
		} else if(idade >= 11 && idade <= 13) {
			System.out.println("Categoria Juvenil A");
		} else if(idade >= 14 && idade <= 17) {
			System.out.println("Categoria Juvenil B");
		} else if(idade > 17) {
			System.out.println("Categoria Adulto");
		}
		
		System.out.println("escolha uma categoria: 1 - Futebol | 2 - Vôlei | 3 - Natação ");
		int categoria = scanner.nextInt();
		
		if (categoria == 1 || categoria == 2) {
			System.out.println("Quadra");
		} else if (categoria == 3) {
			System.out.println("Piscina");
		}
		
		scanner.close();
	}
}
