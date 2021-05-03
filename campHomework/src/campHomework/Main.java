package campHomework;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yazılım geliştirici yetiştirme kampı C# + Angular","Engin demiroğ");
		Course course2 = new Course(1,"Yazılım geliştirici yetiştirme kampı Java + React","Engin demiroğ");
		
		
		Course[] courses = {course1,course2};
		
		
		CourseManager courseManager = new CourseManager();
		
		
		for (Course course : courses) {
			
			courseManager.addCourse(course);
			courseManager.deleteCourse(course);
			
		}
		
		

	}

}
