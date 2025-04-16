package myactivities;
import java.util.Scanner;
public class numascendingorder {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		 
		do {
			System.out.println("Digite o " + i + "º número inteiro");
			if(i == 1) {
				n1 = scanner.nextInt();
			} else if (i == 2) {
				n2 = scanner.nextInt();
			}else {
				n3 = scanner.nextInt();
			}
			i++;
			
		} while (i <=3);
			
			if (n1 > n2) {
				if (n2 > n3) {
					System.out.println("Os números em ordem crescente são: " + n3 + " " + n2 + " " + n1);
				}
			}
			if (n1 > n3) {
				if (n3 > n2) {
					System.out.println("Os números em ordem crescente são: " + n2 + " " + n3 + " " + n1);
				}
			}
			if (n2 > n1) {
				if (n1 > n3) {
			System.out.println("Os números em ordem crescente são: " + n3 + " " + n1 + " " + n2);
				}
			}
			if (n2 > n3) {
				if (n3 > n1) {
					System.out.println("Os números em ordem crescente são: " + n1 + " " + n3 + " " + n2);
				}
			}
			if (n3 > n1) {
				if (n1 > n2) {
					System.out.println("Os números em ordem crescente são: " + n2 + " " + n1 + " " + n3);
					}
			}
			if (n3 > n2) {
				if (n2 > n1) {
					System.out.println("Os números em ordem crescente são: " + n1 + " " + n2 + " " + n3);
					}
			}
		scanner.close();	
		
	}
	
}
