import java.util.Scanner;
class Employee {
	int id;
    String name;
    double salary;
    double CalculateSalary(){
        return this.salary;
    }


    Employee(){
        
        this.id = 101;
        this.name = "Onkar";
        this.salary = 200000;
    }

    Employee(int id, String name, double salary){
       
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

	void setId(int id){ this.id = id; }
	void setName(String str){ this.name = str; }
    void setSalary(double sal){ this.salary = sal; }

	int getId(){ return this.id; }
	String getName(){ return this.name; }
	double getSalary(){ return this.salary; }

	void Display(){
		System.out.println("Employee Id:"+this.id);
        System.out.println("Employee Name:"+this.name);
        System.out.println("Employee Salary:"+this.salary);
	}
}//Employee class ends here

class Manager extends Employee {
    double bonus;
    String Department;
    double CalculateSalary(){
        return this.salary + this.bonus;
    }

    Manager(){
        super();
       
        this.bonus = 0.00;
        this.Department = "not Given";
    }

    Manager(int id, String name, double salary, double bonus, String Department){
        super(id, name, salary);
        this.bonus = bonus;
        this.Department = Department;
    }

    void setBonus(double bonus){ this.bonus = bonus; }
    void setDepartment(String Department){ this.Department = Department; }
    double getBonus(){ return this.bonus; }
    String getDepartment(){ return this.Department; }

    void Display(){
        super.Display();
        System.out.println("Manager Bonus:"+this.bonus);
        System.out.println("Manager Department:"+this.Department);
    }
}//Manager class ends here

class SalesManager extends Employee {
    double target;
    double incentive;
    String region;
    double CalculateSalary(){
        return this.salary + this.incentive;
    }
    SalesManager(){
        super();
        this.target = 0;
        this.incentive = 0;
        this.region = "Not Given";
    }

    SalesManager(int id, String name, double salary, double target, double incentive, String region){
        super(id, name, salary);
        this.target = target;
        this.incentive = incentive;
        this.region = region;
    }

    void setTarget(double target){ this.target = target; }
    void setIncentive(double incentive){ this.incentive = incentive; }
    void setRegion(String region){ this.region = region; }

    void Display(){
        super.Display();
        System.out.println("Sales Target:"+this.target);
        System.out.println("Sales Incentive:"+this.incentive);
        System.out.println("Sales Region:"+this.region);
    }
}//SalesManager class ends here

class TestEmployee {
	public static void main(String args[]){
		Employee e1;
        e1 = new Employee(102,"Rahul",250000);
        System.out.println(e1.CalculateSalary());
        

        System.out.println("--------------");

        e1 = new SalesManager(102 ,"Rahul",250000,50000,5000,"West");
        System.out.println(e1.CalculateSalary());
      

        System.out.println("--------------");

        e1 = new Manager(103,"Sonia",300000,400,"IT");
        System.out.println(e1.CalculateSalary());

	}
}//TestEmployee class ends here
