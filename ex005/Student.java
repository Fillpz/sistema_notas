package ex005;

public class Student {

	// Atributos
	private String name;
	private double[] grades;
	
	// Constantes
	private static final int NUM_GRADES = 3;
	private static final double MIN_GRADE = 0.0;
	private static final double MAX_GRADE = 100.0;
	private static final double APPROVAL_PERCENTAGE = 60.0;
	
	// Método construtor
	public Student(String name, double grade1, double grade2, double grade3) {
		this.name = name;
		this.grades = new double[NUM_GRADES];
		this.grades[0] = grade1;
		this.grades[1] = grade2;
		this.grades[2] = grade3;
	}
	
	// Getters e Setters
	public double[] getGrades() {
		return grades;
	}
	
	public void setGrade1(double[] grades) {
		this.grades = grades;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGrade2(String name) {
		this.name = name;
	}
	
	// Outros métodos
	public double finalGrade() {
		double sum = 0;
		for (double grade : grades) {
			sum += grade;
		}
		return sum;
	}
	
	public String checkApproval() {
		double minApprovalGrade = MAX_GRADE * APPROVAL_PERCENTAGE / 100;
		
		if(finalGrade() >= minApprovalGrade) {
			return "Aprovado";
		} else {
			double pointsNeeded = minApprovalGrade - finalGrade();
			return String.format("Reprovado. Precisa de %.2f prontos", pointsNeeded);
		}
	}
	
	@Override
	public String toString() {
		return "Nome: " + name + "\nNota final = " + String.format("%.2f", finalGrade());
	}
}
