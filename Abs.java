import java.util.Scanner;
abstract class Round1{
    abstract double getPerimeter();
    abstract double getArea();
    public void Hi(){
        System.out.println("Hello,Motherfuckers");
    }
}
class Circle1 extends Round1{
    double radius;
    public Circle1(double radius){
        this.radius = radius;
    }

    double getPerimeter(){
        double pi = 3.142;
        return 2*pi*radius;
    }
    double getArea(){
        double pi = 3.142;
        return pi*(radius*radius);
    }
}
class Cylinder extends Round1{
    double radius;
    double height;
    public Cylinder(double radius,double height){
        this.radius = radius;
        this.height = height;
    }
    public double getPerimeter(){
        double pi = 3.142;
        return (2*pi*radius)+height;
    }
    public double getArea(){
        double pi = 3.142;
        return 2*pi*radius*height;
    }
}
public class Abs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        Circle1 circa = new Circle1(r);
        System.out.print("The circumference is: "+circa.getPerimeter());
        System.out.println();
        System.out.print("The area is: "+circa.getArea());
        System.out.println();
        Cylinder cyl = new Cylinder(r,h);
        System.out.print("The circumference is: "+cyl.getPerimeter());
        System.out.println();
        System.out.print("The area is: "+cyl.getArea());
        ;
    }
}