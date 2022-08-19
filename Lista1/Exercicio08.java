import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o quanto você ganha por hora: ");
		float n = entrada.nextFloat();
		
		System.out.print("E o número de horas trabalhadas no mês: ");
		float n1 = entrada.nextFloat();
		
		System.out.println("Seu salário é de: " + (n * n1));
		
		entrada.close();
}
}