import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o quanto voc� ganha por hora: ");
		float n = entrada.nextFloat();
		
		System.out.print("E o n�mero de horas trabalhadas no m�s: ");
		float n1 = entrada.nextFloat();
		
		double INSS = 0.11, sind = 0.05, IR = 0.08, sal = (n * n1);
		System.out.println("Seu sal�rio bruto � de R$ : " + sal);
		
		INSS *= sal;
		sind *= sal;
		IR *= sal;
		sal = (sal - INSS - IR - sind);		
		
		System.out.println("Desconto INSS: " + INSS);
		System.out.println("Desconto Sindicato: " + sind);
		System.out.println("Imposto de Renda: " + IR);
		System.out.println("Salario l�quido: R$ " + sal);
		
		
		entrada.close();
}
}