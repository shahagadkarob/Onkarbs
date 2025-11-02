class Hr {
    int id;
    String name;
    double salary;
    double commition;


    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setSalary(int salary){
        this.salary = salary;
    }
    void setCommition(int commition){
        this.commition = commition;
    }

}//Hr class ends here

class TestHr {
    public static void main(String args[]){
        Hr h1 = new Hr();

        h1.setId(110);
        h1.setName("Khushi");
        h1.setSalary(30000);
        h1.setCommition(4000);
        System.out.println("Hr Id:"+h1.id+"\nHr Name:"+h1.name+"\nHr Salary:"+h1.salary+"\nHr Commition:"+h1.commition);
        }
}
