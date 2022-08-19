import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma temperatura em graus Farenheit: ");
		double n = entrada.nextDouble();
		double c = (5 *(n - 32)/ 9);
		System.out.println("Transformando em graus Celsius é: " + c);
		
		entrada.close();
}
}