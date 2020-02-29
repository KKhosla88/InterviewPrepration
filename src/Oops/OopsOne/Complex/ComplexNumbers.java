package Oops.OopsOne.Complex;

public class ComplexNumbers {
    private int real;
    private int imaginary;

    public ComplexNumbers(int real, int imaginary){
        this.imaginary = imaginary;
        this.real = real;
    }
    public void plus(ComplexNumbers c2){

        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }
    public void multiply(ComplexNumbers c2){
       
        int d = this.real*c2.real - this.imaginary*c2.imaginary;
        this.imaginary = this.real*c2.imaginary + this.imaginary*c2.real;
        this.real = d;
    }
    public void print(){
        System.out.println((this.real) +" i"+ (this.imaginary));
    }
}
