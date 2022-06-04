
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setFirstName("Sally");
		student.setPhoneNumber("1234567890");
		student.introduce();
		
		Rectangle rec = new Rectangle(10.0, 15.0);
		System.out.println(rec.getArea());
		
		/*
		 * Access modifiers:
		 * public   Accessible everywhere
		 * Private  Only accessible within the class itself
		 * Protected Accessible within the class, other classes in the same package, and all subclasses
		 * No modifier  Same as protected, except
		 */
	}

}
