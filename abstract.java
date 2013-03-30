abstract class Shape{
   final int b = 20;
   public void display(){
     System.out.println("This is display method");
   }
   // abstract method
   abstract public void calculateArea(); 
}
 
class Rectangle extends Shape{
   // Rectangle is not abstract, so it MUST override abstract method calculateArea() in Shape.
   // Add method calculateArea() of its own.
   public void calculateArea(){
     System.out.println("Area = ...");
   }

   public static void main(String args[]){
      Rectangle obj = new Rectangle();
      obj.display();

      // cannot assign a value to final variable b
      // obj.b=200;
  }
}
