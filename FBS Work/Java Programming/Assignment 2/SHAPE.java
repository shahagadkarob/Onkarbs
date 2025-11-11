class Shape {
    double perimeter;
    double area;

    Shape(){
        this.perimeter = 0.0;
        this.area = 0.0;
    }
    Shape(double perimeter, double area){
        this.perimeter = perimeter;
        this.area = area;
    }

    void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }
    void setArea(double area){
        this.area = area;
    }
    double getPerimeter(){
        return perimeter;
    }
    double getArea(){
        return area;
    }

    void displayInfo(){
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}//Shape class ends

class circle extends Shape {
    double radius;

    circle(){
        super();
        this.radius = 0.0;
    }
    circle(double radius){
        super(2*(3.14)*(radius),3.14*(radius)*(radius));
        this.radius = radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    double getRadius(){
        return radius;
    }
    void displayInfo(){
        System.out.println("Radius: " + radius);
        super.displayInfo();
    }

}//circle class ends

class rectangle extends Shape {
    double length;
    double breadth;

    rectangle(){
        super();
        this.length = 0.0;
        this.breadth = 0.0;
    }
    rectangle(double length, double breadth){
        super(2*(length+breadth),length*breadth);
        this.length = length;
        this.breadth = breadth;
    }
    void setLength(double length){
        this.length = length;
    }
    void setBreadth(double breadth){
        this.breadth = breadth;
    }
    double getLength(){
        return length;
    }
    double getBreadth(){
        return breadth;
    }
    void displayInfo(){
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        super.displayInfo();
    }

}

class testShape {
    public static void main(String[] args){
        circle c1 = new circle(5.0);
        rectangle r1 = new rectangle(4.0,6.0);

        c1.displayInfo();
        System.out.println();
        r1.displayInfo();
    }
}