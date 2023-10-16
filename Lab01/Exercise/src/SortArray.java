// Exercise 6.5: SortArray.java
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter size of array :");
        int sum=0;
        int size=input.nextInt();
        int[] arr = new int[size];
    for(int i=0; i<size; i++){
        arr[i]=input.nextInt();
        sum+=arr[i];
       }
        System.out.println("Before after sort");
       for(int i=0; i<size; i++){
        System.out.print(arr[i]+" ");
       }
       Arrays.sort(arr);
       System.out.println("");
       System.out.println("Array after sort");
       for(int i=0; i<size; i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println("sum of array "+sum);

        input.close();
    }
}
