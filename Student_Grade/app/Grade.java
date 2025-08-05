package app;

import java.util.Scanner;

import entities.Student;


public class Grade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		Student student = new Student();
		
		System.out.print("Nome do aluno: ");
		
		student.name = sc.nextLine();
		
		System.out.println("\nNotas");
		System.out.print("\nNota 1: ");
		
		student.grade1 = sc.nextDouble();
		
		System.out.print("nota 2: ");
		
		student.grade2 = sc.nextDouble();
		
		System.out.print("nota 3: ");
		
		student.grade3 = sc.nextDouble();
		
		System.out.print("\nAluno: " + student.name);
		System.out.printf("\nNota final: %.1f", student.final_grade());
		
		if (student.final_grade() < 10) {
			System.out.printf("Reprovou faltando %.1f pontos na média", student.missing_points());	
		}
	
		else {
			   System.out.printf("\nPassou com a média %.1f ", student.final_grade());
		}

	    sc.close();

	}
}
