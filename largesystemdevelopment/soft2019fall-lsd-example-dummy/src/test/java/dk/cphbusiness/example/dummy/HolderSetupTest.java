package dk.cphbusiness.example.dummy;

import dk.cphbusiness.example.contract.Holder;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HolderSetupTest {
  
  @Test
  public void setupTest() {
    Holder.manager = new PersonManagerDummy();
    assertTrue(true);
    }

  }
