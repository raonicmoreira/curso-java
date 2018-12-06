package entities;

public class Student {
	
	public String name;
	public double av1;
	public double av2;
	public double av3;
	
	
	public double finalGrade() {
		return av1 + av2 + av3;
	}
	
	public String toString() {
		if (finalGrade() >= 60) {
			return "FINAL GRADE = "
				+ String.format("%.2f", finalGrade())
				+ "\nPASS";
		}
		else {
			return "FINAL GRADE = "
					+ String.format("%.2f", finalGrade())
					+ "\nFAILED\n"
					+ "MISSING "
					+ String.format("%.2f", (60 - finalGrade()))
					+ " POINTS";
		}
	}
		

}
