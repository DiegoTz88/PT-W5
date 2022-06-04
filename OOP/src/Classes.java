
public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder name = new StringBuilder();
		StringBuilder name2 = new StringBuilder();
		
		Student student1 = new Student();
		student1.firstName = "Tom";
		student1.lastName = "Smith";
		student1.gradeLevel = 12;
		student1.phoneNumber = "480-123-4567";
		
		student1.introduce();
		
		Student student2 = new Student("Sammy", "Jones");
		student2.introduce();
		
		Student student3 = new Student("Tam", "Jess", "207-709-9608", 11);
		student3.introduce();
	}

}
