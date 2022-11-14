package assignment2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	
	private static  Scanner sc;

	public Student(int nextInt, String nextLine) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.out.println("Please enter number of student");
		Integer[] stue = new Integer[sc.nextInt()];
		sc.nextLine();
		for(int i =0; i<stue.length;i++) {
			
			
		}
		
        sc =  new Scanner(System.in);
	    List<Student> studs =new ArrayList<Student>();
		Student stu1 = new Student(sc.nextInt(), sc.nextLine());

		System.out.println("Please enter name");
		Student stu2 = new Student( sc.nextInt(),sc.nextLine());
		

		System.out.println("Please enter email");
		Student stu3 = new Student(sc.nextInt(),  sc.nextLine());
		
		System.out.println("Please enter Phone");
		Student stu4 = new Student(sc.nextInt(),  sc.nextLine());
		
		System.out.println("Please enter address");
		Student stu5 = new Student(sc.nextInt(), sc.nextLine());
		
		System.out.println("Please enter status");
		Student stu6 = new Student(sc.nextInt(), sc.nextLine());



		System.out.println("Please enter which student details are you looking for");
		Student stu7 = new Student(sc.nextInt(), sc.nextLine());
		
		studs.add(stu1);
		studs.add(stu2);
	    studs.add(stu3);

	    studs.add(stu4);
	    studs.add(stu5);
	    studs.add(stu6);
	    studs.add(stu7);
		
		
		

		
		}
		

		}


