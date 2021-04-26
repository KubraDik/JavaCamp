
public class Main {

	public static void main(String[] args) {

		Course course1=new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� ","JAVA+REACT","Engin Demiro�");
		Course course2=new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� ","C#+ANGULAR","Engin Demiro�");
		Course course3=new Course(3,"Programlamaya Giri� ��in Temel Kurs ","T�m Programlama Dilleri","Engin Demiro�");
		
		Course[] courses= {
				course1,course2,course3
		};
		
		for (Course course : courses) {
			System.out.println(course.courseName);
			System.out.println(course.courseType);
			System.out.println(course.instructor);
		}
		
		CourseManager courseManager=new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.removeCourse(course3);
	}

}
