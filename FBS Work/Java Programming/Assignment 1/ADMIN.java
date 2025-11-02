class Admin {
	int id;
    String name;
    double salary;
    double allowance;

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
    void setAllowance(double allowance)
	{ 
		this.salary = allowance;
	}
	}//Employee class ends here
class TestAdmin {
	public static void main(String args[]){
		Admin a1;
		a1= new Admin();
		a1.setId(123);
		a1.setName("Onkar");
		a1.setSalary(20000);
        a1.setAllowance(5000);


		System.out.println("Admin Id:"+a1.id+" Admin Name:"+a1.name+" Admin Salary:"+a1.salary+"  Allowance:"+a1.allowance);
		

		
	}//main ends here
}//TestAdmin class ends here
