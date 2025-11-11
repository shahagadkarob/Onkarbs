import java.util.Scanner;
class Employee {
	int id;
    String name;
    double salary;

    Employee(){
        System.out.println("Inside Employee default constructor");
    this.id = 101;
    this.name = "Onkar";
    this.salary = 200000;
    }
    Employee(int id, String name,double salary){
        System.out.println("Inside Employee parameterized constructor");
    this.id = id;
    this.name = name;
    this.salary = salary;
    }


	void setId(int id)
	{ 
		this.id = id;
	}
	void setName(String str)
	{ 
		this.name = str;
	}
    void setSalary(double sal)
	{ 
		this.salary = sal;
	}
	int getId(){
		return this.id;
	}
	String getName(){
		return this.name;
	}
	double getSalary(){
		return this.salary;
	}

	void Display(){
		System.out.println("Employee Id:"+this.id);
        System.out.println("Employee Name:"+this.name);
        System.out.println("Employee Salary:"+this.salary);

	}
}//Employee class ends here

class Manager extends Employee {
    double bonus;
    String Department;

Manager(){
    super();
    System.out.println("Inside Manager default constructor");
    this.bonus = 0.00;
    this.Department = "not Given";
}
Manager(int id,String name,double salary,double bonus,String Department){
    super(id,name,salary);
    System.out.println("Inside Manager parameterized constructor");
    this.bonus = bonus;
    this.Department = Department;
}
void setBonus(double bonus){
    this.bonus = bonus;
}
void setDepartment(String Department){
    this.Department = Department;
}
double getBonus(){
    return this.bonus;
}
String getDepartment(){
    return this.Department;
}
void Display(){
    super.Display();
    System.out.println("Manager Bounus:"+this.bonus);
    System.out.println("Manager Department:"+this.Department);
}
}//Manager class ends here
class TestEmployee {
	public static void main(String args[]){
		// Scanner sc= new Scanner(System.in);
		// System.out.println("Enter details of first employee:");
		// System.out.println("--------------------------------");
		// System.out.print("Enter employee id:");
		// int id= sc.nextInt();
		// sc.nextLine();  
		// System.out.print("Enter employee name:");
		// String name= sc.next();
		// System.out.print("Enter employee salary:");
		// double salary= sc.nextDouble();
        Employee e1= new Employee(110,"Bob",250000);
        Manager m1= new Manager(112,"Alice",300000,15000,"Sales");
		// System.out.println("Employee Id:"+e1.id+" Employee Name:"+e1.name+" Employee Salary:"+e1.salary);
		e1.Display();
        m1.Display();


		
	}//main ends here
}//TestEmployee class ends here 