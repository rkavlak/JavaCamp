
public class Student extends User {
	
	private String takenCourses;
	
	public Student() {
		
	}

	public Student(String takenCourses) {
		super();
		this.takenCourses = takenCourses;
	}

	public String getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(String takenCourses) {
		this.takenCourses = takenCourses;
	}
	
	
}
