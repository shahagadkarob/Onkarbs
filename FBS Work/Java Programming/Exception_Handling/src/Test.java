
public class Test {

	public static void main(String[] args) {
		Student s = new Student(1,"Onkar",0);
		try {
			s.CalculateGrade();
		} catch (InvalidMaxMarkException | InvalidMinMarkException e) {
			// TODO Auto-generated catch block
			System.out.println(e);;
		}

	}
	
}
