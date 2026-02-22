
public class Student {
	
	int RollNo;
	String Name;
	int Marks;

	Student(int RollNo,String Name,int Marks)
	{
		this.RollNo = RollNo;
		this.Name = Name;
		this.Marks=Marks;
	}
	
	void CalculateGrade() throws InvalidMaxMarkException,InvalidMinMarkException
	
	{
		if(Marks>=35 && Marks<=49) 
		{
			System.out.println("Pass");
		}
		else if (Marks>=50 && Marks<=59) 
		{
			System.out.println("Second Class");
		}
		else if (Marks>=60 && Marks<=74) 
		{
			System.out.println("First Class");
		}
		else if (Marks>=75 && Marks<=100) 
		{
			System.out.println("Distinction");
		}
		else if(Marks<0)
		{
			throw new InvalidMinMarkException();
		}
		else if(Marks>100) 
		{
			throw new InvalidMaxMarkException();
		}
		else 
		{
			System.out.println("Fail..!");
		}
	}
}
