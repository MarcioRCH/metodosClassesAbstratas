package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;
import entities.Individual;
import entities.Company;

public class DifferentTaxes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		for(int i=0; i<n; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individal or Company (i/c)? ");
			char ch = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double helthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, helthExpenditures));
			}else if(ch == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
			System.out.println();
		}
		
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for(TaxPayer taxPayer : list) {
			System.out.println(taxPayer.getName() + " $" + String.format("%.2f", taxPayer.tax()));
			sum += taxPayer.tax();
		}
		System.out.println();
		System.out.print("TOTAL TAXES: " + String.format("%.2f", sum));
		
		sc.close();
	}

}
