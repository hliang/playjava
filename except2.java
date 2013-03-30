class JavaException {
   public static void main(String args[]){
    try{
       int d = 2;
       int n =20;
       int fraction = n/d;
    }
  catch(ArithmeticException e){
    System.out.println("In the catch clock due to Exception = "+e);
  }

  // In case, an exception is raised in the try block, finally block is executed after the catch block is executed.
  // The finally block is optional to use with a try block. i.e. the finally block will excuted no mathere there is an exception or not.
  finally{
    System.out.println("Inside the finally block");
  }
}
}

