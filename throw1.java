import java.io.*;

/*
class file1{
  public static void main(String[] args) {
     try{
           FileWriter file = new FileWriter("/tmp/Data1.txt");
           file.write("Guru99");
           file.close();
    }
    catch(IOException e){}
  }
}
*/


class file1{
  // syntax:
  // method (Arguments) throws Exception1,Exception2,Exception, ... {}
  public static void main(String[] args) throws IOException{
    FileWriter file = new FileWriter("/tmp/Data1.txt");
    file.write("Guru99\n");
    file.close();
  }
}

// In sum, there are two methods to handle Exceptions.
// 1. Put the Exception causing code in try and catch block.
// 2. Declare the method to be throwing an Exception
//
// difference between throw and throws?
// throw : It is used to create a new Exception object and throw it
// throws : is used in method definition , to declare that a risky method is being called.
