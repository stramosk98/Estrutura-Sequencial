import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o raio de um c�rculo: ");
		double n = entrada.nextDouble();
		n = (n * 2) * Math.PI;
		
		System.out.println("Sua area � de: " + n);
		
		entrada.close();
}
}