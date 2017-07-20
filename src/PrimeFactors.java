/**
 * Created by ritter on 17-7-20.
 */
public class PrimeFactors {
  public static void main(String[] args) {
    int n = 30;
    for (int i = 2; i <= n; ++i) {
      while (n % i == 0) {
        System.out.print(i + " ");
        n = n / i;
      }

    }
  }
}
