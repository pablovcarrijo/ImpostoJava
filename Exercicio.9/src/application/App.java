package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.MainClass;
import model.entities.PessoaFisica;
import model.entities.PessoaJuridica;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		List<MainClass> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.println("\nTax payer #" + (i+1) + " data:");
			System.out.print("Individual or campanu (i/c)? ");
			char ch = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			Double renda = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				Double medicoGasto = sc.nextDouble();
				
				MainClass mainClassFisica = new PessoaFisica(name, renda, medicoGasto);
				list.add(mainClassFisica);
			}
			else if(ch == 'c') {
				System.out.print("Number of employees? ");
				Integer numberEmployees = sc.nextInt();
				
				MainClass mainClassJuricia = new PessoaJuridica(name, renda, numberEmployees);
				list.add(mainClassJuricia);
			}
			
		}
		
		Double totalImposto = 0.0;
		
		for(MainClass x : list) {
			System.out.println(x.getName() + " - $" + String.format("%.2f", x.calcImposto()));
			totalImposto += x.calcImposto();
		}
		
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", totalImposto));
		
	}

}
