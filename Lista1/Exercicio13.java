import java.util.Scanner;

public class Exercicio13 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("CONTROLADOR DE RENDIMENTOS DI�RIO DE JO�O \n");
		System.out.print("Informe quantos KGs foram pescados hoje: ");
		float peso = entrada.nextFloat();
		float multa, excesso;
		if(peso > 50) {
			excesso = (peso - 50);
			multa = excesso * 4;
		}else {
			multa = 0;
			excesso = 0;
		}
			System.out.println("Jo�o pescou " + excesso + " KGs a mais, ent�o dever� pagar R$ " + multa + " de multa hoje");
		entrada.close();
}
}