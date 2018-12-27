 import java.util.*;

public class helloworld1
{


     public static void main(String args[])

     {
 
  
 
   
 
    String op;
      Scanner sc = new Scanner(System.in);
    System.out.println(" enter any fields ");

     op = sc.nextLine();
      

       switch(op)
     
   {

           case "rollno":

                       System.out.println(" 2012103627 ");

                       break;
     
           case "dept":

                       System.out.println(" computer science ");
    
                   break;
   
             case "name":
                  
                      System.out.println("  pradeep ");

                        break;
 
          case "age":

                       System.out.println(" 18 ");
           
                      break;
  
          default : 
                     System.out.println(" enter proper fields  ");

  
      }

     }

}