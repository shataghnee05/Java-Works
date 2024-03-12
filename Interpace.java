import java.util.Scanner;
interface pat{
    void getPattern(int n);
    void getNumPattern(int n);
}
class Pattern implements pat{
    public void getPattern(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
    public void getNumPattern(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
public class Interpace{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int a = sc.nextInt();
        Pattern p = new Pattern();
        p.getPattern(a);
        p.getNumPattern(a);
    }
}