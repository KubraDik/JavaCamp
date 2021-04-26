
public class CourseManager {

	public void addCourse(Course course)
	{
		System.out.println(course.courseName+" "+ course.courseType+ " "+"kursu eklendi.");
	}
	
	public void removeCourse(Course course)
	{
		System.out.println( course.courseName +" "+ course.courseType+ " "+"kursu silindi.");
	}
	
}
