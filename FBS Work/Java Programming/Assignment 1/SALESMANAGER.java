class salesManager {
    int id;
    String name;
    double salary;
    int incentive;
    int target;

    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setSalary(int salary){
        this.salary = salary;
    }
    void setIncentive(int incentive){
        this.incentive = incentive;
    }
    void setTarget(int target){
        this.target = target;
    }
}

class testSalesManager {
    public static void main(String[] args){
        salesManager s1 = new salesManager();

        s1.setId(120);
        s1.setName("Prajwal");
        s1.setSalary(40000);
        s1.setIncentive(5000);
        s1.setTarget(20);

        System.out.println("SalesManager Id:"+s1.id+"\nSalesManager Name:"+s1.name+"\nSalesManager Salary:"+s1.salary+"\nSalesManager Incentive:"+s1.incentive+"\nSalesManager Targets:"+s1.target);


    }
}

