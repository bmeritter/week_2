/**
 * Created by ritter on 17-7-13.
 */
public class Triangle {
  public static void main(String[] argv) {
    int n = 3;
    for (int i = 0; i < 3; ++i) {
      for(int j=0; j<=i; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
