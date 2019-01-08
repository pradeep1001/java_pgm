// name 
// rate 
//price calculation :  name *  price * quantity
import java.util.*;
 abstract class Cake
{
 String name;
 double rate;
    public Cake (String n, double r)
  {
    name = n;rate = r;
  }
	public abstract double calcPrice();
	public String toString()
   {
  	return name +" "+ rate;
    }
}




    class  orderCake extends Cake
 {
    // weight;
	
         double weight;

      public    orderCake(String a,double b)
    {  
       super(a,b);
    }
       void setWeight(double weight)
         {
           this.weight  = weight;
          }
        public double getWeight()
       {
         return weight ;
       } 
   

     public  double calcPrice()
  {
       double price;
      price =   getWeight()*rate;        
      return price;
  }
}
class  readyMadeCake extends Cake
 {
		// quantity;
        double quantity;
        	public  readyMadeCake(String c, double d)
	{
             super(c,d);
	}

   void setQuantity(double quantity)
         {
           this.quantity  =  quantity;
          }
        public double getQuantity()
       {
         return  quantity;
       } 
      
            public  double calcPrice()
 	     {
            double price;
            price =   getQuantity()*rate;        
             return price;
       	}
}
 public   class Test2
{

     public static void main(String[] args)
   {
    readyMadeCake b1 = new readyMadeCake("italy",150);
      String a[] = new String[20];
      Scanner in = new Scanner(System.in);
         System.out.println(" enter names of 20 cakes : ");
  
        HashMap<String,Integer> records = new HashMap<String,Integer>();
        records.put("vanilla",200);
        records.put("strawberry",150);
        records.put("black",100);
        records.put("blue",512);
        records.put("red",222);

        records.put("white",232);
        records.put("green",210);
        records.put("cyan",290);
        records.put("pudding",470);
        records.put("apple",279); 
 
       records.put("banana",512);
        records.put("yellow",890);
        records.put("pink",678);
        records.put("marron",876);
        records.put("rainbow",789);        
        
       records.put("beetroot",453);
        records.put("jelly",354);
        records.put("topping",760);
        records.put("radish",400);
        records.put("cake",390); 
    Set<String> allkeys = records.keySet();
        int sum = 0;
        for(String str : allkeys)
     {
       int  record = records.get(str);
        
        System.out.println(" name of the cake is : \t  "+str+"price is: \t" +record  );         

     }
      for(String str : allkeys)
     {
       int  record = records.get(str);
        
        sum = sum + record ;         

     }
       int b[] = new int[20];
       
 for(String str : allkeys)
     {
        int  record = records.get(str);
         int i=0;
          while(i<20)
         {
           b[i]=record;
           i++; 
        }                  

      }
     int temp,j,i;

   for(i=0;i<19;i++)
    {
      for(j=0;j<(20-i) - 1;j++)
       {
         temp = b[j];
         b[j] = b[j+1];
         b[j+1]=temp;    
        
       }
     
     }
   System.out.println(" the cake that has been sold for the highest price : "+b[19]);  
 
       System.out.println("total price :  " + sum);
        b1.setQuantity(8);
System.out.println( " total price is  :  "+b1.calcPrice()+" and quantity sold is : "+b1.getQuantity());        
    }
}
     
                 
  