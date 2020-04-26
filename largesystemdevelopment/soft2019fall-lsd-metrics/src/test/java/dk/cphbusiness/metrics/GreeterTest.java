package dk.cphbusiness.metrics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreeterTest {
  private Greeter greeter = new Greeter();
  
  @Test
  public void testGreetingKurt() {
    String name = "Kurt";
    String result = greeter.sayHell(name);
    assertEquals(result, "Hello Kurt!");
    }
  
  @Test
  public void testGreetingNull() {
    String result = greeter.sayHell(null);
    assertEquals(result, "Please give a proper name");
    }
  
  @Test
  public void testGreetingSpaces() {
    String result = greeter.sayHell("  ");
    assertEquals(result, "Please give a proper name");
    }
  
  }
