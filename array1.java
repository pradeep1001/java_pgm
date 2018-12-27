import java.util.*;
class array1
{
   public static void main(String args[])
 {
      int count ;
 
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the size of the array ");
     count = sc.nextInt();    


   int[] ar= new int[count];
    
int i;
 for(i =0;i<ar.length;i++)
  {
           System.out.println(" enter the elements of the array ");
           ar[i]= sc.nextInt();
   }
   
  
    System.out.println("  elements of the array are : ");
    for(i =0;i<ar.length;i++)
  {
           System.out.println(ar[i] + "\t "); 
   }
  
     
 }
}