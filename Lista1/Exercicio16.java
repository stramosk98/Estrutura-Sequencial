import java.util.Scanner;

public class Exercicio16 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho da ?rea a ser pintada em m?: ");
		float m = entrada.nextFloat();
		float litro = m / 6;
		float lata = litro / 18;
		double galao = litro / 3.6;
		double pre?oLata = Math.ceil(lata) * 80;
		double pre?oGalao = Math.ceil(galao) * 25;
		
		System.out.println("Dever? ser comprada(s) " + Math.ceil(lata) + " lata(s) de tinta, e o pre?o total ser? de R$ " + pre?oLata);
		System.out.println("Dever? ser comprada(s) " + Math.ceil(galao) + " gal?o(?es) de tinta, e o pre?o total ser? de R$ " + pre?oGalao);
		entrada.close();
}
}