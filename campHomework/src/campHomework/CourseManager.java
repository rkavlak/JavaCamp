package campHomework;

public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println(course.name + " adl� kurs ba�ar�yla eklendi. " + " Bu kurs " + course.lecturer + " taraf�ndan verilmektedir."  );
		
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.name + " adl� kurs ba�ar�yla silindi");
		
	}
	
	public void ListCourses(Course[] course) { 
		
		System.out.println("Kurslar listelendi");
	}
	
}
