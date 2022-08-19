import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua altura: ");
		float alt = entrada.nextFloat();
		double ideal = ((72.7 * alt) - 58);
		System.out.println("Seu peso ideal será de: " + ideal + " kilos");
		
		entrada.close();
}
}