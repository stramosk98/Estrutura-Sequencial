import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o quanto voc� ganha por hora: ");
		float n = entrada.nextFloat();
		
		System.out.print("E o n�mero de horas trabalhadas no m�s: ");
		float n1 = entrada.nextFloat();
		
		System.out.println("Seu sal�rio � de: " + (n * n1));
		
		entrada.close();
}
}