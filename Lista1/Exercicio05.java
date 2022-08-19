import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os metros a serem convertidos: ");
		float n = entrada.nextFloat();
		
		System.out.println(n + " metro(s) convertido(s) são: " + (n * 100) + " centímetro(s)");
		
		entrada.close();
}
}