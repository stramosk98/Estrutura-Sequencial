import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o raio de um círculo: ");
		double n = entrada.nextDouble();
		n = (n * 2) * Math.PI;
		
		System.out.println("Sua area é de: " + n);
		
		entrada.close();
}
}