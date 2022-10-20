class Student{

String name;
int rollNo;
String dob;
String branch;
String college;

   void studing(){
 
     System.out.println(name+" "+college+" "+branch+" is Study in this college...!");
	 
   }
 
public static void main(String args[]){

  Student ritesh = new Student();
  
   ritesh.name = "Ritesh";
   ritesh.rollNo = 21;
   ritesh.dob = "27.01.1998";
   ritesh.branch = "Comp.sc";
   ritesh.college = "Mpc autonoumous";
   
   ritesh.studing();
	   
  Student shakti = new Student();

    shakti.name = "Shakti";
	shakti.rollNo = 30;
	shakti.dob = "13.08.1998";
	shakti.branch = "comp.sc";
	shakti.college = "Centurion university";
	
   shakti.studing();
  
  Student pranay = new Student();
 
    pranay.name = "Pranay";
	pranay.rollNo = 25;
	pranay.dob = "13.09.1998";
	pranay.branch = "b.pharma";
	pranay.college = "centurion university";
	
   pranay.studing();
   
} 	
  
}