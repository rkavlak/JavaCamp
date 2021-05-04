
public class InstructorManager {

	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getName() + " " + instructor.getLastName() + " created the course name " + instructor.getGivenCourses());
	}
	
	public void updateCourse(Instructor instructor) {
		System.out.println(instructor.getName() + " " + instructor.getLastName() + " deleted the course name " + instructor.getGivenCourses());
	}
	public void deleteCourse(Instructor instructor) {
		System.out.println(instructor.getName() + " " + instructor.getLastName() + " updated the course name " + instructor.getGivenCourses());
	}
	
	
}
