import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros: ");
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		System.out.println("A soma dos dois números é: ");
		System.out.println(n1 + n2);
		
		entrada.close();
	}

}