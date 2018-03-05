package Sheet3;

public class Student {
	
	private final int id;
	private final String firstName;
	private final String surname;
	private final int cw1;
	private final int cw2;
	private final int exam;
	
	public Student(int id, String firstName, String surname, int cw1, int cw2, int exam) {
		this.id = id;
		this.firstName = firstName;
		this.surname = surname;
		this.cw1 = cw1;
		this.cw2 = cw2;
		this.exam = exam;	
	}
	
	public double getFinalMark() {
		return Math.round(((cw1 * 0.1) + (cw2 * 0.1) + (exam * 0.8)) * 10.0) / 10.0;
	}
	public String getName() {
		return firstName;
	}
	

}
