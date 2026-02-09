import java.util.*;
public class SparseMatrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();int c=sc.nextInt(),z=0,nz=0;
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          arr[i][j]=sc.nextInt();
          if(arr[i][j]==0)
            z++;
         else nz++;
            
        
    }
    }  
      System.out.println(z>nz?"TRUE":"FALSE");
      if(z>nz){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]!=0){
                    System.out.println(i+" "+j+" "+arr[i][j]);
                }
            }
        }
      }
          
        
        
    }
}