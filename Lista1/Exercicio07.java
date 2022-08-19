import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o raio de um quadrado: ");
		float n = entrada.nextFloat();

		System.out.println("Sua area é de: " + (n * n));
		
		entrada.close();
}
}