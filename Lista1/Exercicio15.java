import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho da �rea a ser pintada em m�: ");
		float m = entrada.nextFloat();
		float litro = m / 3;
		float lata = litro / 18;
		double pre�o = Math.ceil(lata) * 80;
		
		System.out.println("Dever� ser comprada(s) " + Math.ceil(lata) + " lata(s) de tinta, e o pre�o total ser� de R$ " + pre�o);
		
		entrada.close();
}
}