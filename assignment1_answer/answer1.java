 import java.util.*;  
class answer1
       {
           public static void  main(String[] args)
            {
                 Scanner scan = new Scanner(System.in);
           
                System.out.println(" enter the value");
                int a;
                a= scan.nextInt();
                  int r500,r100,r50,r20,r10,r5,r2,r1;
                  r500 = a/500; 
                  a=a%500;
                  r100 = a/100; 
                  a=a%100;
                 r50 = a/50; 
                  a=a%50;
                 r20 = a/20; 
                  a=a%20;
                r10 = a/10; 
                  a=a%10;
               r5 = a/5; 
                  a=a%5;
               r2 = a/2; 
                  a=a%2;
               r1 = a/1; 
                  a=a%1;     
              System.out.println( " number of 500 rupees note : " +r500);
              System.out.println( " number of 100 rupees note : " +r100);
              System.out.println( " number of 50 rupees note : " +r50);
              System.out.println( " number of 20 rupees note : " +r20);
              System.out.println( " number of 10 rupees note : " +r10);
              System.out.println( " number of 5 rupees note : " +r5);
              System.out.println( " number of 2rupees note : " +r2);
              System.out.println( " number of 1 rupees note : " +r1);
               

       }
}