package Sheet3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinalMark {

	public static void main(String[] args) {


			readFile();

	}
	
	public static void readFile() {
		Scanner in = null;
		
		try {
			in = new Scanner(new File("student_marks.txt"));
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		String student;
		Scanner scan;
		
		while(in.hasNextLine()) {
			 student = in.nextLine();
			 scan = new Scanner(student);
			
			String id = "( " + scan.next() + "): ";
			System.out.println(scan.next() + " " + scan.next() + id + 
					Math.round(((scan.nextInt()*0.1) + (scan.nextInt()*0.1) + (scan.nextInt()*0.8)) *10.0)/10.0 );			
			
		}
		
		
		
	}

}
