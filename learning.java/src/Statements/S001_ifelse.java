package Statements;
import java.util.Scanner;

public class S001_ifelse {
	 public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int  marks = sc.nextInt();
		 
		if(marks<=34)
		{
			System.out.println("Fail");
		}
		
		else if (marks>=91 && marks<=100) 
		{
			System.out.println("A grade");
		}
			
		else if (marks>=71 && marks<=90) 
		{
			System.out.println("B grade");
		}
			
		else if (marks>=71 && marks<=90) 
		{
			System.out.println("C grade");
		}
		
		else if (marks>=35 && marks<=50) 
		{
			System.out.println("D grade");
		}
		else  
		{
			System.out.println("Invalid Marks");
		}
				
	}

}
