package dk.cphbusiness.metrics;

public class Greeter {
  private int abc;
  
  private String ip = "127.0.0.1";
  
  public String sayHell(String name) {
    StringBuilder result = new StringBuilder();
    if (name == null || name.trim().isEmpty() ) {
      result.append("Please give a proper name");
      }
    else {
      result.append("Hello "+name+"!");
      }
    return result.toString();
    }
  
  public void test() {
    String[] field = {"a", "b", "c", "s", "e"};
    String s = "";
    for (int i = 0; i < field.length; ++i) {
      s = s + field[i];
      }
    System.out.println(ip);
    }
  
  }
