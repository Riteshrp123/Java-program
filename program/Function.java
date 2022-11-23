package com.xworkz.corejava.program;

public class Function {
	  double answer;
      void call (char symbol, int value1, int value2) {
    	  
    	  
	  switch(symbol) {
	  case  '+' : System.out.println(answer=value1+value2);
	  break;
	  case  '-' : System.out.println(answer=value1-value2);
	  break;
	  case  '*' : System.out.println(answer=value1*value2);
	  break;
	  case  '/' : System.out.println(answer=value1/value2);
	  break;
	  default : System.out.println("invalid Input");
	  }
  }
      public static void main(String [] args) {
    	  Function fun =new Function();
    	  fun.call('/', 9, 5);
      }
}


