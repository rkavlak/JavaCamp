package campHomework;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yaz�l�m geli�tirici yeti�tirme kamp� C# + Angular","Engin demiro�");
		Course course2 = new Course(1,"Yaz�l�m geli�tirici yeti�tirme kamp� Java + React","Engin demiro�");
		
		
		Course[] courses = {course1,course2};
		
		
		CourseManager courseManager = new CourseManager();
		
		
		for (Course course : courses) {
			
			courseManager.addCourse(course);
			courseManager.deleteCourse(course);
			
		}
		
		

	}

}
