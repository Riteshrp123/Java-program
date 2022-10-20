class VariableTest{

int a;
static int b;

public static void main(String args[]){

int c;
b = 10;
System.out.println("b : "+b);

VariableTest test = new VariableTest();
test.a =10;
System.out.println(test.a);
System.out.println("test.b : "+ test.b); // 10

test.b = 40;

System.out.println("test.b : "+ test.b); // 40

VariableTest test1 = new VariableTest();
 test1.a =20;
 test1.b =60;
 System.out.println(test1.a);
 System.out.println("test1.b : "+ test1.b); // 60

 System.out.println("test.b : "+ test.b); // 60
 
 }


}