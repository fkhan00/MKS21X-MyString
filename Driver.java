public class Driver
{
  public static void main(String[] args)
  {
    MyString testCase = new MyString("hello");
    System.out.println("testing Constructor");
    System.out.print("expected: hello");
    System.out.println(" recieved: " + testCase.toString());
    System.out.println("\ntesting length method");
    System.out.print("expected: 5");
    System.out.println(" recieved " + testCase.length());
    System.out.println("\ntesting charAt method");
    System.out.print("expected: h");
    System.out.println(" recieved: " +  testCase.charAt(0));
    System.out.println("expected: index out bounds error caught");
    try{
    System.out.println(" revieved: " + testCase.charAt(1000));
  }
  catch(IndexOutOfBoundsException e)
  {
    System.out.print("recieved : index out of bounds error caught");
    System.out.println();
  }
    System.out.println("\ntesting subsequence");
    System.out.print("expected hel");
    System.out.println(" recieved: " + testCase.subSequence(0, 3));
    System.out.println("expected: index out of bounds error upper");
    try
    {
    System.out.println(" recieved: " + testCase.subSequence(1000, 100000));
  }
  catch(IndexOutOfBoundsException e)
  {
    System.out.println("recieved: index out of bounds error upper");
  }
  System.out.println("expected: index out of bounds error end < begin");
  try
  {
    System.out.println("recieved: " + testCase.subSequence(10, 6));
  }
  catch(IndexOutOfBoundsException e)
  {
    System.out.println("recieved: index out of bounds error end < begin");
  }
  System.out.println("expected: index out of bounds error lower");
  try
  {
  System.out.println("recieved: " + testCase.subSequence(-3, -2));
}
catch(IndexOutOfBoundsException e)
{
  System.out.print("recieved: index out of bounds error lower\n");
}

    System.out.println("\ntesting compareTo");
    System.out.print("expected: 1");
    System.out.println(" recieved: " + testCase.compareTo("hellos"));
    System.out.print("expected: 0");
    System.out.println(" recieved " + testCase.compareTo("hello"));
  }
}
