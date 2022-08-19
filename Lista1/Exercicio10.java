import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite dois números inteiros e um número real: ");
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		float n3 = entrada.nextFloat();
		float a = (n2 / 2);
		float b = (n1 * 3) + n3;
		double c = Math.pow(n3, 3);
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + a);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + b);
		System.out.println("O terceiro elevado ao cubo: " + c);
		
		entrada.close();
}
}
