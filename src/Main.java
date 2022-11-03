public class Main {
  public static void main(String[] args) {
    System.out.println("main method runs");
    Chatbot bot1 = new Chatbot();
    Chatbot bot2 = new Chatbot("舞武");
    bot1.greeting();
    bot2.greeting();
    bot2.setName("小波蔵");
    bot2.greeting();
    bot2.setName("差別用語");
    bot2.setName("黒崎一護");
  }
}
