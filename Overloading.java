import java.util.*;
public class Overloading{

    static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }
    static int sum(int a,int b, int c){
        int sum = a+b+c;
        return sum;
    }
    static int sum(int a,int b,int c,int d){
        int sum = a+b+c+d;
        return sum;
    }


    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int u = p.nextInt();
        int v = p.nextInt();
        int w = p.nextInt();
        int x = p.nextInt();
        System.out.println(sum(u,v));
        System.out.println(sum(u,v,w));
        System.out.println(sum(u,v,w,x));



        }
    }

