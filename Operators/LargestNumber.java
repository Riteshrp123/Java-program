public class LargestNumber
{  
public static void main(String[] args)   
{  
int a, b, c, largest;  
 
System.out.println("28:"); 
a = 28; 
System.out.println("39:"); 
b = 39;   
System.out.println("49:"); 
c = 49; 
largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
  
System.out.println("The largest number is: "+largest); 
 
}  

}  