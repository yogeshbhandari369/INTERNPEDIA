import java.util.Scanner;

public class StdGradeCalcMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Enter total number of subjects
		System.out.println("Enter total number of subjects:");
		int noOfSub=sc.nextInt();
		int totalMarks=0;
		
		//Calculate sum of all subjects
		for(int i=0;i<noOfSub;i++) {
			System.out.println("Enter marks for subject "+(i+1)+" (out of 100) :");
			int marks=sc.nextInt();
			//Input Validation
			while(marks<0||marks>100) {
				System.out.println("Invalid marks please enter between 0 and 100");
				System.out.println("Enter marks for subject "+(i+1)+" (out of 100) :");
				marks=sc.nextInt();
			}
			totalMarks+=marks;
		}
		System.out.println("Student Results:");
		System.out.println("Total marks obtained in all subjects: "+totalMarks);
		int averagePercentage=totalMarks/noOfSub;
		System.out.println("Average Percentage: "+averagePercentage);
		if(averagePercentage>=90) {
			System.out.println("Your grade: A+");
		}else if(averagePercentage>=80) {
			System.out.println("Your grade: A");
		}else if(averagePercentage>=70) {
			System.out.println("Your grade: B+");
		}else if(averagePercentage>=60) {
			System.out.println("Your grade: B");
		}else if(averagePercentage>=50) {
			System.out.println("Your grade: C+");
		}else if(averagePercentage>=40) {
			System.out.println("Your grade: C");
		}else if(averagePercentage>=30) {
			System.out.println("Your grade: D+");
		}else if(averagePercentage>=20){
			System.out.println("Your grade: D");
		}else {
			System.out.println("Your grade: E");
		}
		sc.close();
	}
}
