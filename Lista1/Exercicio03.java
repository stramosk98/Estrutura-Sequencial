import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros inteiros: ");
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		System.out.println("A soma dos dois n�meros �: ");
		System.out.println(n1 + n2);
		
		entrada.close();
	}

}