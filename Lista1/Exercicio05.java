import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os metros a serem convertidos: ");
		float n = entrada.nextFloat();
		
		System.out.println(n + " metro(s) convertido(s) s�o: " + (n * 100) + " cent�metro(s)");
		
		entrada.close();
}
}