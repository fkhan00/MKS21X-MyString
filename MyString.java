public class MyString implements CharSequence, Comparable<CharSequence>
{
  private char[] data;
  public MyString(CharSequence s)
  {
    // initializing data
    data = new char[s.length()];
    for(int i = 0; i < s.length(); i++)
    {
      //filling data with... data from parameter
      data[i] = s.charAt(i);
    }
  }

  public char charAt(int index)
  {
    if(index > data.length || index < 0)
    {
      throw new IndexOutOfBoundsException();
    }
    return data[index];
  }

  public int length()
  {
    return data.length;
  }

  public CharSequence subSequence(int begin, int end)
  {
    if(begin <  0 || end < 0 || begin >= data.length || end >= data.length || begin > end)
    {
      throw new IndexOutOfBoundsException();
    }
    // starting with empty String
    String output = "";
    for(int i = begin; i < end; i++)
    {
      //concantenate each element within this sublist to output
      output += data[i];
    }
    return output;
  }

  public String toString()
  {
    //empty string
    String output = "";
    for(int i = 0; i < data.length; i++)
    {
      //contanetate each element
      output += data[i];
    }
    return output;
  }

  public int compareTo(CharSequence power)
  {
    if(power.length() != this.length())
    {
      // check for out of bound errors and inequality
      return 1;
    }
    for(int i = 0; i < power.length(); i++)
    {
      //inequality
      if(data[i] != this.data[i])
      {
        return 1;
      }
    }
    // if it gets this far they must be equal
    return 0;
  }

}
