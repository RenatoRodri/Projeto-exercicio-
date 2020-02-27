package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSoucerEmployee;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List<Employee> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
		System.out.println("Employee #"+i+ " data:");	
		System.out.print("Outsourced (y/n)? ");
		char result = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Hours: ");
		int hours = sc.nextInt();
		System.out.print("Value per Hours: ");
		double value = sc.nextDouble();
		if(result == 'y') {
			System.out.print("Additional charge: ");
			double OutSoucer = sc.nextDouble();
			Employee dados2 = new OutSoucerEmployee(name, hours, value, OutSoucer);
			list.add(dados2);
		}
		else {
			Employee  dados1 = new Employee(name, hours, value);
			list.add(dados1);
		}
		
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee x: list ) {
			System.out.println(x.getName() + " - $ " + String.format("%.2f",x.payment()));
		}
		
		
		
		
		
		

		sc.close();
	}

}
