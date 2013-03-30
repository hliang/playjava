class JavaException {
  public static void main(String args[]){

    try{
      int d =0;
      int n =20;
      int fraction = n/d;
      int g[] ={1} ;
      g[20] =100;
    }

//  Compilation Errror ? This is because Exception is the base class of ArithmeticException Exception. Any Exception that is raised by ArithmeticException can be handled by Exception class as well .So the catch block of ArithmeticException will never get a chance to be executed which makes it redundant. Hence the compilation error.
    catch(Exception e){
      System.out.println("In the catch clock due to Exception = "+e);
    }
    catch(ArithmeticException e){
      System.out.println("In the catch clock due to Exception = "+e);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("In the catch clock due to Exception = "+e);
    }

    System.out.println("End Of Main");
  }
}

