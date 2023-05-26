package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Applications {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Insira o número de Contribuintes: ");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.println("Dados do #" + i + " contribuinte: ");
			System.out.print("Individual or company (i/c): ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String name = sc.next();
			//por algum motivo nao pegava o getName() entao tive q colocar o next()
			//espera-se dois nomes como sao apenas um temos que pular linha
			//sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Gastos com saúde: ");
				double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastoSaude));
			} else {
				System.out.print("Número de funcionários: ");
				int nFuncionario = sc.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, nFuncionario));
			}
		}
		System.out.println();
		System.out.println("Impostos pagos por cada contribuinte: ");
		for (Contribuinte contribuinte : list) {
			System.out.println(contribuinte.getName() + 
										": $ " + 
										String.format("%.2f", contribuinte.imposto()));			
		}
		double sum = 0.0;
		for (Contribuinte contribuinte : list) {
			sum += contribuinte.imposto();
		}
		System.out.printf("Impostos totais: $ %.2f", sum);
		sc.close();
	}
}