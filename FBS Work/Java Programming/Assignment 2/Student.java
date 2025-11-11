class Student {
    int FBIid;
    String name;
    double Distance;
    static int count;

    Student() {
        System.out.println("Inside Student default constructor");
        FBIid = 10;
        name = "No Name";
        Distance = 10;
        count++;
    }

    Student(int FBIid, String name, double Distance) {
        System.out.println("Inside Student parameterized constructor");
        this.FBIid = FBIid;
        this.name = name;
        this.Distance = Distance;
        count++;
    }

    static int getCount() {
        return count;
    }

    static void setCount(int count) {
        Student.count = count;
    }

    int getFBIid() {
        return FBIid;
    }

    void setFBIid(int FBIid) {
        this.FBIid = FBIid;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    double getDistance() {
        return Distance;
    }

    void setDistance(double Distance) {
        this.Distance = Distance;
    }

    void Display() {
        System.out.println("ID is: " + this.FBIid);
        System.out.println("Name is: " + this.name);
        System.out.println("Distance traveled is: " + this.Distance);
    }
}


class placeStudent extends Student {
    // int FBIid;
    // String name;
    // double Distance;
    String CName;
    String Designation;

    placeStudent() {
        System.out.println("Inside placeStudent default constructor");
        FBIid = 100;
        name = "not given";
        Distance = 10;
        CName = "xyz";
        Designation = "pqr";
    }

    placeStudent(int FBIid, String name, double Distance, String CName, String Designation) {
        System.out.println("Inside placeStudent parameterized constructor");
        this.FBIid = FBIid;
        this.name = name;
        this.Distance = Distance;
        this.CName = CName;
        this.Designation = Designation;
    }

    void setFBIid(int FBIid) {
        this.FBIid = FBIid;
    }

    void setName(String name) {
        this.name = name;
    }

    void setDistance(double Distance) {
        this.Distance = Distance;
    }

    void setCName(String CName) {
        this.CName = CName;
    }

    void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    void Display() {
        super.Display();
        // System.out.println("ID is: " + this.FBIid);
        // System.out.println("Name is: " + this.name);
        // System.out.println("Distance traveled is: " + this.Distance);
        System.out.println("Company Name is: " + this.CName);
        System.out.println("Designation is: " + this.Designation);
    }
}

class DemoInheritance {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // System.out.println("Count is:"+ Student.getCount());

        // Student s2 = new Student(101,"Aditya",100);
        // System.out.println("Count is:"+ Student.getCount());

        // placeStudent ps1 = new placeStudent();
        // System.out.println("Count is:"+ Student.getCount());

        placeStudent ps1 = new placeStudent();
        ps1.Display();
        System.out.println(ps1.getName());
    }
}
