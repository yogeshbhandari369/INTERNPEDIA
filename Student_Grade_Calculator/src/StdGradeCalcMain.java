import java.util.Scanner;

public class StdGradeCalcMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Enter total number of subjects to calculate their marks
		System.out.println("Enter total number of subjects:");
		int noOfSub=sc.nextInt();
		int totalMarks=0;
		
		for(int i=0;i<noOfSub;i++) {
			System.out.println("Enter marks for subject Number "+(i+1)+" (out of 100) :");
			int marks=sc.nextInt();
			//Input Validation
			while(marks<0||marks>100) {
				System.out.println("Invalid marks please enter between 0 and 100");
				System.out.println("Enter marks for subject Number "+(i+1)+" (out of 100) :");
				marks=sc.nextInt();
			}
			totalMarks+=marks;
		}
		System.out.println("Student Results:");
		System.out.println("Total marks obtained in all subjects: "+totalMarks);
		sc.close();
	}
}
