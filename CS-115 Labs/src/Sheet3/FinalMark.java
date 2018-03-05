package Sheet3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FinalMark {

	public static void main(String[] args) {

		readFile();
		
		

	}
	
	public static void descFinalMark(Student[] students){
		Student temp;
		
		for(int i = 0; i < students.length - 1; i++) {
			for(int n = 1; n < students.length ; n++) {
				
				if(students[n].getFinalMark() > students[n - 1].getFinalMark()) {
					temp = students[n];
					students[n] = students[n-1];
					students[n-1] = temp;
					
				}				
			}			
			
			
		}


		for(Student stu: students) {
			System.out.println(stu.getName() + " " + stu.getFinalMark());
		}
		
		
	}

	public static void readFile() {
		Student[] students = new Student[200];
		Scanner in = null;
		Scanner scan = null;

		try {
			in = new Scanner(new File("student_marks.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

		int count = 0;
		while (in.hasNextLine()) {
			String student = in.nextLine();
			scan = new Scanner(student);
			
			Student newStudent = new Student(scan.nextInt(), scan.next(), scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt());

			/*String id = " (" + scan.next() + "): ";
			System.out.println(scan.next() + " " + scan.next() + id
					+ Math.round(((scan.nextInt() * 0.1) + (scan.nextInt() * 0.1) + (scan.nextInt() * 0.8)) * 10.0)
							/ 10.0);*/
			//students.add(newStudent);
			students[count]  = newStudent;
			count++;
			
			
			
		}
		in.close();
		scan.close();
		
		descFinalMark(students);
		

	}

}
