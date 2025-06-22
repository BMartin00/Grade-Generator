package assignment;

import java.util.Scanner;

public class GradeGenerator
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the exam mark (0 - 75): ");
		int examMark = in.nextInt();
		System.out.print("Enter the coursework mark (0 - 25): ");
		int courseworkMark = in.nextInt();
		
		if (examMark > 75 || examMark < 0 || courseworkMark > 25 || courseworkMark < 0)
		{
			System.out.println("FM");
			in.close();
			return;
		}
		
		int overallMark = calculatingOverallMark(examMark, courseworkMark);
		System.out.println("Overall mark: " + overallMark);
		
		char grade = generatingGrade(overallMark);
		System.out.println("Grade: " + grade);
		
		in.close();
	}
	
	public static int calculatingOverallMark(int examMark, int courseworkMark)
	{
		int overallMark = examMark + courseworkMark;
		return overallMark;
	}
	
	public static char generatingGrade(int overallMark)
	{
		if (overallMark >= 70)
		{
			return 'A';
		}
		else if (overallMark >= 50 && overallMark < 70)
		{
			return 'B';
		}
		else if (overallMark >=30 && overallMark < 50)
		{
			return 'C';
		}
		else
		{
			return 'D';
		}
	}
}
