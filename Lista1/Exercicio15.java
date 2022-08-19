import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho da área a ser pintada em m²: ");
		float m = entrada.nextFloat();
		float litro = m / 3;
		float lata = litro / 18;
		double preço = Math.ceil(lata) * 80;
		
		System.out.println("Deverá ser comprada(s) " + Math.ceil(lata) + " lata(s) de tinta, e o preço total será de R$ " + preço);
		
		entrada.close();
}
}