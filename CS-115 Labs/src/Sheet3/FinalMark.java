package Sheet3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FinalMark {

	public static void main(String[] args) {

		// outputs final marks in descending order
		for (Student stu : descFinalMark(readFile())) {
			System.out.println(stu.getFirstName() + " " + stu.getSurname() + ": " + stu.getFinalMark());
		}

	}

	/**
	 * sorts a Student array by descending order of final marks	  
	 * @param students array being sorted
	 * @return sorted array
	 */
	public static Student[] descFinalMark(Student[] students) {
		Student temp;

		for (int i = 0; i < students.length - 1; i++) {
			for (int n = 1; n < students.length; n++) {
				if (students[n].getFinalMark() > students[n - 1].getFinalMark()) {
					temp = students[n];
					students[n] = students[n - 1];
					students[n - 1] = temp;
				}
			}

		}
		return students;
	}

	/**
	 * reads in a file of students data adds students to an array	  
	 * @return the array of students
	 */
	public static Student[] readFile() {
		Student[] students = new Student[200];
		Scanner in = null;
		Scanner scan = null;

		try {
			in = new Scanner(new File("student_marks.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

		int count = 0;
		
		/* Loops through all lines in the file */		
		for (int i = 0; in.hasNextLine(); i++) {
			String student = in.nextLine();
			scan = new Scanner(student);

			students[i] = new Student(scan.nextInt(), scan.next(), scan.next(), scan.nextInt(), scan.nextInt(),
					scan.nextInt()); // adds students data to the array
		}

		in.close();
		scan.close();

		return students;

	}

}
