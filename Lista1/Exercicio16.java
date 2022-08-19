import java.util.Scanner;

public class Exercicio16 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho da área a ser pintada em m²: ");
		float m = entrada.nextFloat();
		float litro = m / 6;
		float lata = litro / 18;
		double galao = litro / 3.6;
		double preçoLata = Math.ceil(lata) * 80;
		double preçoGalao = Math.ceil(galao) * 25;
		
		System.out.println("Deverá ser comprada(s) " + Math.ceil(lata) + " lata(s) de tinta, e o preço total será de R$ " + preçoLata);
		System.out.println("Deverá ser comprada(s) " + Math.ceil(galao) + " galão(ões) de tinta, e o preço total será de R$ " + preçoGalao);
		entrada.close();
}
}