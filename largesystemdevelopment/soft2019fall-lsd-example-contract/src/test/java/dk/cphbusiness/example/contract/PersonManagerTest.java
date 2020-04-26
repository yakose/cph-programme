package dk.cphbusiness.example.contract;

import dk.cphbusiness.example.contract.dto.PersonSummary;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonManagerTest {
  
  @Test 
  public void testNumberOfPeople() {
    Collection<PersonSummary> people = Holder.manager.list();
    assertEquals(3, people.size());
    }
  
  }
