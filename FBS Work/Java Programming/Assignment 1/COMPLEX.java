class Complex {
    double real;
    double imaginary;

    void setReal(double real)
    {
        this.real = real;
    }
    void setImaginary(double imaginary)
    {
        this.imaginary = imaginary;
    }
}//Complex class ends here

class testComplex {
    public static void main(String args[]){
        Complex c1 = new Complex();

        c1.setReal(5.6);
        c1.setImaginary(3.2);

        System.out.println("Complex Number is: "+c1.real+" + "+c1.imaginary+"i");
    }
}//testComplex class ends here
