package ex005;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student("Alex Green", 30, 31, 32);
		
		System.out.println(s1 + "\n" + s1.checkApproval());
		
		sc.close();
	}
}