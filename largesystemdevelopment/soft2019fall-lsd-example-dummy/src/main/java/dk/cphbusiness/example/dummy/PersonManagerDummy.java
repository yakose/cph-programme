package dk.cphbusiness.example.dummy;

import dk.cphbusiness.example.contract.PersonManager;
import dk.cphbusiness.example.contract.dto.PersonDetail;
import dk.cphbusiness.example.contract.dto.PersonIdentifier;
import dk.cphbusiness.example.contract.dto.PersonSummary;
import java.util.Collection;
import static dk.cphbusiness.example.dummy.PersonConverter.*;
import java.util.ArrayList;

public class PersonManagerDummy implements PersonManager {
  
  public PersonManagerDummy() {
    new Person("Anders", "Kalhauge", "aka@cphbusiness.dk");
    new Person("Jacob", "Trier Frederiksen", "jtf@cphbusiness.dk");
    new Person("Dora", "Dimitrova", "tdi@cphbusiness.dk");

    }

  @Override
  public String hello(String name) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  @Override
  public Collection<PersonSummary> list() {
    Collection<PersonSummary> summaries = new ArrayList<>();
    for (Person person : Person.list()) summaries.add(personSummaryFrom(person));
    return summaries;
    }

  @Override
  public PersonDetail find(PersonIdentifier identifier) {
    return personDetailFrom(Person.find(identifier.getId()));
    }

  @Override
  public PersonDetail save(PersonDetail detail) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
