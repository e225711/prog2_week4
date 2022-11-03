public class Chatbot {
  private String name;
  public Chatbot() {
    System.out.println("チャットボットの原型を作成します。");
  }
  public Chatbot(String name) {
    this.name = name;
    System.out.println("チャットボット名" + this.name + "を作成します");
  }
  public void greeting() {
    System.out.println("はじめまして" + this.name + "です、よろしくおねがいします");
  }
  public void setName(String name) {
    if (name == "差別用語") {
      System.out.println("禁止されています");
    }else {
      System.out.println("ボット名を" + this.name + "から" + name + "へと変更します");
      this.name = name;
    }
  }
  public String getName() {
    return this.name;
  }
}