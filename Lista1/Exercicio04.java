import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float n = 0;
		
		System.out.println("Digite suas quatro notas bimestrais: ");
		n += entrada.nextFloat();
		n += entrada.nextFloat();
		n += entrada.nextFloat();
		n += entrada.nextFloat();
		
		System.out.println("A sua média bimestral é: " + (n / 4));
		
		entrada.close();
}
}