class Employee {
	int id;
    String name;
    double salary;
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
	}//Employee class ends here
class TestEmployee {
	public static void main(String args[]){
		Employee e1;
		e1= new Employee();
		e1.setId(123);
		e1.setName("Onkar");
		e1.setSalary(20000);

		System.out.println("Employee Id:"+e1.id+" Employee Name:"+e1.name+" Employee Salary:"+e1.salary);
		

		
	}//main ends here
}//TestEmployee class ends here