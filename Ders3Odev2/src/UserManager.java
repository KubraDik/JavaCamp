
public class UserManager {
	public void add(User user) {
		
		System.out.println(user.firstName+" "+user.lastName+" "+" sisteme kaydoldu.");
		
	}

	public void addMultiple(User[] users) {
		
		for(User user:users) {
			add(user);
		}
	}
	

	public void addCardInformation(User user) {
		System.out.println(user.firstName+" "+user.lastName+" sisteme "+user.cardInformation+"  kart bilgileri ekledi.");
		
	}

	public void deleteCardInformation(User user) {
		System.out.println(user.firstName+" "+user.lastName+" sisteme "+user.cardInformation+"  kart bilgisini sildi.");

		
	}
	public void addCourses(User user) {
		System.out.println(user.firstName+" "+user.lastName+" "+user.courses+"  kursunu ekledi.");
		
	}
  public void deleteCourses(User user) {
	  System.out.println(user.firstName+" "+user.lastName+" "+user.courses+"  kursunu sildi.");
		
	}


 
  

}
