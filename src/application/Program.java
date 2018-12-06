package application;

import java.util.Scanner;

public class Program{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int mat [][] = new int[n][m];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		sc.close();
		
	}
}


/*
import java.util.Scanner;

public class Program{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mat [] [] = new int [n][n];
		
		
		for( int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat [i] [j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for( int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for( int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
				
			}
		}
		
		System.out.println("Negative numbers = " + count);
		
		sc.close();
	}
}

*/


/*
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> listEmp = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.println();
			System.out.println("Emplyoee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			listEmp.add(new Employee(id, name, salary));
			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Employee emp = listEmp.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employee obj : listEmp) {
			System.out.println(obj);
		}
		
		sc.close();
	}
}
*/


/*
import java.util.Locale;
import java.util.Scanner;

import entities.Hospede;

public class Program{
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Hospede[] vect = new Hospede[10];
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Hospede(name, email);
						
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ", " + vect[i]);
			}
		}
		
		
		
		sc.close();
	}
}
*/

/*
import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;

public class Program{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = 0;
		System.out.print("Enter account number: ");
		int numero = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("\nIs there na initial deposit (y/n)? ");
		char opcao = sc.next().charAt(0);
		if(opcao == 'y') {
			System.out.print("Enter initial deposit value: ");
			valor = sc.nextDouble();
		}
		ContaCorrente cc = new ContaCorrente(numero, titular, valor);
		
		System.out.println("\nAccount data:");
		System.out.println(cc);
		System.out.print("\nEnter a deposit value: ");
		valor = sc.nextDouble();
		cc.deposito(valor);
		System.out.println("Updated account data:");
		System.out.println(cc);
		
		System.out.print("\nEnter a withdraw value: ");
		valor = sc.nextDouble();
		cc.saque(valor);
		System.out.println("Updated account data:");
		System.out.println(cc);
		
		sc.close();
	}
}

*/
/*
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle re = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		re.width = sc.nextDouble();
		re.height = sc.nextDouble();
		
		System.out.println(re);
			
		sc.close();
		}
}
*/
/*
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println("Employee: " + emp);
		
		System.out.print("Which percentage to increase salary? ");
		emp.ncreaseSalary(sc.nextDouble());
		
		System.out.println("Update data: " + emp);
		
		
		
	}
}
*/
/*
import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program{
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		System.out.print("Informe o nome do aluno: ");
		st.name = sc.nextLine();
		System.out.print("Informe nota da av1: ");
		st.av1 = sc.nextDouble();
		System.out.print("Informe nota da av2: ");
		st.av2 = sc.nextDouble();
		System.out.print("Informe nota da av3: ");
		st.av3 = sc.nextDouble();
		
		System.out.println(st);
			
	}
}
*/