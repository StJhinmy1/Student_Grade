package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2; 
	public double grade3;
	
	
	public double final_grade() {
		return (grade1 + grade2 + grade3) / 3;
		
	}
	
	public double missing_points() {
		if(final_grade() < 10) {
			return 10.0 - final_grade();
		}
		else {
			   return 0.0;
		}
		
	}
	
}
