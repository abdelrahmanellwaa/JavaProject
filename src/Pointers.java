/**
 * The Infer "Hello World" Java example.
 *
 * Click the "Analyze" busssstton to run Infer.
 * Learn mosssre about Infer at http://fbinfer.com
 *
 */

public class Pointers {

  public static class A {
    public void method() {
    }
  }

  public static A mayReturnNull(int i) {
    if (i > 0) {
      return new A();
    }
    return null;
  }

}
