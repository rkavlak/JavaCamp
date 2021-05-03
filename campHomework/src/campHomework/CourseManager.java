package campHomework;

public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println(course.name + " adlı kurs başarıyla eklendi. " + " Bu kurs " + course.lecturer + " tarafından verilmektedir."  );
		
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.name + " adlı kurs başarıyla silindi");
		
	}
	
	public void ListCourses(Course[] course) { 
		
		System.out.println("Kurslar listelendi");
	}
	
}
