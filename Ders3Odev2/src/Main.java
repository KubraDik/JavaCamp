
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.firstName="Kübra";
		student.lastName="Dik";
		student.courses="JAVA";
		student.homework="3.hafta ";
		student.cardInformation=5879;
	
		
	
		Instructor instructor=new Instructor();
		instructor.firstName="Engin";
		instructor.lastName="Demiroð";
		instructor.certificate="PMP";
		instructor.cardInformation=1457;
		
		UserManager userManager=new UserManager();
		
		
		User[]users= {student,instructor};
		userManager.addMultiple(users);
		userManager.addCardInformation(instructor);
		userManager.deleteCardInformation(student);
		userManager.addCourses(student);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addCertificate(instructor);
	
		
		
		StudentManager studentManager=new StudentManager();
		studentManager.addHomework(student);
	}

}
