import java.util.Scanner;

public class Exercicio12 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua altura: ");
		float alt = entrada.nextFloat();
		double idealH = ((72.7 * alt) - 58);
		double idealM = ((62.1*alt) - 44.7);
		System.out.println("Se homem, seu peso ideal será de: " + idealH + " kilos");
		System.out.println("Se mulher, seu peso ideal será de: " + idealM + " kilos");
		
		entrada.close();
}
}