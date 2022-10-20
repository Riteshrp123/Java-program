class Flower{

String name;
String colour;
int noOfpetals;

  void sheddingFragrance(){

   System.out.println(colour+" "+name+" is Shedding fragrance...!");  

  }

void blooming(){

System.out.println(colour+" "+name+" is blooming...!");

}

public static void main(String args[]){

  Flower rose = new Flower();
 
   rose.name = "Rose";
   rose.colour = "Red";
   rose.noOfpetals = 12;
   
   rose.blooming();
    rose.sheddingFragrance();
}
   
}