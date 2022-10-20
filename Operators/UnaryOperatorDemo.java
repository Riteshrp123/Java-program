class UnaryOperatorDemo{

public static void main(String[] args){

int a = 10;
int b = a++;
int c = (--b)+(--a);

c++;
++a;
b--;

System.out.println("a : "+ (a--)); //11
System.out.println("b+c: "+ (b+c)); //28
System.out.println("b : "+ (--b)); //7
System.out.println("c : "+ c); //20 
System.out.println("b+c: "+ (b+c)); //27

 //a = 10
 
 //c = 20
}

}