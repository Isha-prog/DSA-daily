//Print the elements of the array which are less than the given integer n

import java.util.*;
public class MultiDimArrayPrinter{
    public static void main (String args[]){
        int [][] Arr2D={{1},{1,2},
            {1,2,3},
            {4,5,6,7}
        };

// iteration using a for each loop

Scanner sc=new Scanner (System.in);
int n=sc.nextInt(); 
for(int[] row:Arr2D){
    for(int val:row){
        if (val<n){
            System.out.print(val+" ");
        }
    }
}
    }
}