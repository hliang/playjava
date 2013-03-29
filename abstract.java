abstract class Shape{
   final int b = 20;
   public void display(){
     System.out.println("This is display method");
   }
   abstract public void calculateArea(); 
}
 
//class Rectangle extends Shape{
class Rectangle {
   public static void main(String args[]){
      Rectangle obj = new Rectangle();
      obj.display();
     //obj.b=200;
  }
}


/*
abstract class Shape
{
       void display()
       {
       }   
}

class Rectangle extends Shape
{
       void display()
       {
              System.out.println("You are using rectangle class");
       }
}

class AbstractClassDemo
{
       public static void main(String args[])
       {
               Shape sObj = new Rectangle();
               sObj.display();
      }
}
*/
