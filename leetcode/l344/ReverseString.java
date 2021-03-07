package leetcode.l344;

import java.util.Arrays;

public class ReverseString {

  public static void main(String[] args) {
    ReverseString reverseString = new ReverseString();
    char[] c = {'w','t','r'};
    reverseString.reverseString(c);
  }

  public void reverseString(char[] s) {
    // if (s.length == 0) {
    //   System.out.println(Arrays.toString(s));
    // }

    for (int i=0,j=s.length-1; i < j; i++,j--) {
      char temp = s[i];
      s[i] = s[j];
      s[j] = temp;
    }

    System.out.println(s);

  }
}
