class NestedIfConditionDemo{

public static void main(String[] args){

String qualification = "BSE";
boolean knowJava = true;

if(qualification == "BSE"){

if(knowJava){

System.out.println("your are eligible to attend interview");
}
else{
System.out.println("your are not eligible to attend interview because you don't know java");
}
}
else{
System.out.println("your are not eligible to attend interview because you not a BSE student");
}
}

}