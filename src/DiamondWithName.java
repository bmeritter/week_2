/**
 * Created by ritter on 17-7-20.
 */
public class DiamondWithName {
  public static void main(String[] argv) {
    int n = 3;
    for (int i = 1; i <= n; ++i) {
      if (i == n) {
        System.out.print("Bill");
      } else {
        for (int j = 1; j <= n - i; ++j) {
          System.out.print(" ");
        }
        for (int j = 1; j < 2 * i; ++j) {
          System.out.print("*");
        }
      }
      System.out.println();
    }
    for (int i = n - 1; i > 0; --i) {
      for (int j = 0; j < n - i; ++j) {
        System.out.print(" ");
      }
      for (int j = 1; j < 2 * i; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
