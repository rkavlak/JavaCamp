
public class StudentManager {
	
	public void takeCourses(Student student) {
		System.out.println("Student "+ student.getName() + " " + student.getLastName() + " taked the course name " + student.getTakenCourses());
	}
	public void deleteCourses(Student student) {
		System.out.println("Student "+ student.getName() + " " + student.getLastName() + " deleted the course name " + student.getTakenCourses());
	}
	
}
