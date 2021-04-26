
public class Main {

	public static void main(String[] args) {

		Course course1=new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý ","JAVA+REACT","Engin Demiroð");
		Course course2=new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý ","C#+ANGULAR","Engin Demiroð");
		Course course3=new Course(3,"Programlamaya Giriþ Ýçin Temel Kurs ","Tüm Programlama Dilleri","Engin Demiroð");
		
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
