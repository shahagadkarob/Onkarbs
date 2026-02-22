
public class Voter {
	int age;
	
	Voter(int age)
	{
		this.age = age;
	}
	void validate() throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException();
		}
		else
		{
			System.out.println("You can Vote...!");
		}
	}
}
