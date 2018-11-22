import java.util.stream.IntStream;
public class MyString implements CharSequence, Comparable<CharSequence>
{
  private char[] data;
  public MyString(CharSequence s)
  {
    data = new s.length();
    data[0] = s.charAt(0);
  }
  public char charAt(int index)
  {
    return data[index];
  }

}
