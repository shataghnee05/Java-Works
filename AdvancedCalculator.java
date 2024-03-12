import java.util.*;
class Cube{
    int side;
    public Cube(int side){
        this.side = side;
    }
    public int getCArea(int side){return side*side;}
    public int getVol(int i){
        return i*i*i;
    }
}
class Rectangle extends Cube{
    int breadth;
    public Rectangle(int side,int breadth){
        super(side);
        this.breadth = breadth;

    }
    public int getPeri(int i,int breadth){
        int c = 2*(i+breadth);
        return c;
    }
    public int getArea(int i,int breadth){
        int d = i*breadth;
        return d;
    }

}
class Cuboid extends Rectangle{
    int height;
    public Cuboid(int breadth,int side,int height){
        super(side,breadth);
        this.height = height;
    }
    public int getVolume(int side,int breadth,int height){
        int x = side*breadth*height;
        return x;
    }
    public int getCSA(int side,int breadth,int height){
        int y = 2*((side*breadth)+(breadth*height)+(height*side));
        return y;
    }
}
class Circle{
    double radius;
    double pi = 3.142;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(double radius){
        return pi*(radius*radius);
    }
    public double getV(double radius){
        double z = 4/3;
        return z*pi*(radius*radius*radius);
    }
}
public class AdvancedCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the advanced Calculator");
        System.out.print("Enter Operation character: ");
        char e = sc.next().charAt(0);
        switch(e){
            case 'A':
                System.out.print("Enter side/length: ");
                int a = sc.nextInt();
                Cube cu = new Cube(a);
                System.out.println("Curved Surface Area: "+cu.getCArea(a));
                System.out.println("Volume: "+cu.getVol(a));
                break;
            case 'B':
                System.out.print("Enter side/length: ");
                int d = sc.nextInt();
                System.out.print("Enter breadth: ");
                int b = sc.nextInt();
                Rectangle r = new Rectangle(d,b);
                System.out.println("Perimeter: "+r.getPeri(d,b));
                System.out.println("Area: "+r.getArea(d,b));
                break;
            case 'C':
                System.out.print("Enter side/length: ");
                int m = sc.nextInt();
                System.out.print("Enter breadth: ");
                int n = sc.nextInt();
                System.out.print("Enter width: ");
                int o = sc.nextInt();
                Cuboid coo = new Cuboid(m,n,o);
                System.out.println("Volume: "+coo.getVolume(m,n,o));
                System.out.println("Curved Surface Area: "+coo.getCSA(m,n,o));
                break;
            case 'D':
                System.out.print("Enter radius: ");
                double ri = sc.nextDouble();
                Circle cir = new Circle(ri);
                System.out.println("Area: "+cir.getArea(ri));
                System.out.println("Volume: "+cir.getV(ri));
                break;
            default:
                System.out.println("You are a motherfucker");
        }
        System.out.println("Thank you for your service\nI hope I can give you something better in Future ");
    }
}

