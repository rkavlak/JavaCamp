
public class Main {

	public static void main(String[] args) {
		Student();
		Instructor();
		User();
	}

	private static void Student() {
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Ramazan");
		student1.setLastName("Kavlak");
		student1.setTakenCourses("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		
		StudentManager studentManager= new StudentManager();
		studentManager.takeCourses(student1);
		studentManager.deleteCourses(student1);
	}

	private static void Instructor() {
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setName("Engin");
		instructor1.setLastName("Demiro�");
		instructor1.setGivenCourses("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor1);
		instructorManager.updateCourse(instructor1);
		instructorManager.deleteCourse(instructor1);
	}

	private static void User() {
		User user1 = new User();
		user1.setId(1);
		user1.setName("Ramazan");
		user1.setLastName("Kavlak");
		
		UserManager userManager= new UserManager();
		userManager.login(user1);
		userManager.logout(user1);
	}

}
