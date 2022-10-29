class SwapTwoNumber{

public static void main(String[] args){

int x = 10,y = 20;
System.out.println("Values before Swapping:");

System.out.println("x = " +x+" y = "+y);

x = x*y; 
y = x/y; 
x = x/y; 

System.out.println("Values after Swapping:");

System.out.println("x = " +x+" y = "+y);

}
}