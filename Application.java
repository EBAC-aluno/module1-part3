public class Application {
  public static void main(String[] args) {

    IStack s = new Stack();
    s.push(6);
    s.push(53);
    s.push(3);
    s.push(7);
    s.push(22);
    s.push(9);
    s.push(1);

    while (!s.isEmpty()) {
      System.out.println(s.pop());
    }

  }
}
