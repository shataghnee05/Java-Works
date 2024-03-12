
import java.util.*;

public class Array{
    static int sum(int[] marks){
        int sum = 0;
        for(int i = 0;i<marks.length;i++){
            sum += marks[i];
        }
        return sum;
    }
    static double avg(int[] marks,int sum){
        double average = (double) sum/marks.length;
        return average;

    }
    static int maximum(int[] marks){
        int max = marks[0];
        for(int i = 1;i<marks.length;i++){
            if(marks[i]>max){
                max = marks[i];
            }

        }
        return max;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the required number of elements in the array :: ");
        int size = s.nextInt();
        int marks[] = new int [size];


        for(int i=0; i<size; i++) {
            System.out.print("Enter element "+(i+1)+" :");
            marks[i] = s.nextInt();
            System.out.println(Arrays.toString(marks));
        }
        int b = sum(marks);
        System.out.println("The sum is of the array is: "+b);
        double c = avg(marks,b);
        System.out.println("The average is: "+c);
        int d = maximum(marks);
        System.out.println("The maximum value is: "+d);
    }
}