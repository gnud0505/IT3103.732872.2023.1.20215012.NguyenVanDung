//Exercise 6.6: TwoMatrices.java
import java.util.Scanner;

public class TwoMatrices {
    public static void main(String[] args){
        System.out.println("Enter size a x b of matric 1:");
        Scanner Scanner= new Scanner(System.in);
        int a=Scanner.nextInt();
        int b=Scanner.nextInt();
        int[][] matric1= new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                matric1[i][j]=Scanner.nextInt();            }
        }
        System.out.println("Enter size c x d of matric 2:");
        int c=Scanner.nextInt();
        int d=Scanner.nextInt();
        int[][] matric2= new int[c][d];
        for(int i=0; i<c; i++){
            for(int j=0; j<d; j++){
                matric2[i][j]=Scanner.nextInt();            }
        }
        int [][] res= new int [a][b];
        if(a==c&&b==d){
         for(int i=0; i<c; i++){
            for(int j=0; j<d; j++){
             res[i][j]=matric1[i][j]+matric2[i][j];
            System.out.print(" "+res[i][j]); 
                     }
                     System.out.print("\n");
        }
    }
    else{
        System.out.println("You enter errors size of matric");
    }

        Scanner.close();
    }
}
