
public class Test2 {

	public static void main(String[] args) {
		Voter v = new Voter(45);
		try {
			v.validate();
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
