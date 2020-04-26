package dk.cphbusiness.example.backend;

import dk.cphbusiness.example.contract.dto.PersonDetail;
import dk.cphbusiness.example.contract.dto.PersonSummary;
import dk.cphbusiness.example.model.Person;
import java.util.ArrayList;
import java.util.Collection;

class PersonConverter {
   
  static PersonDetail personDetailFrom(Person entity) {
    return new PersonDetail(
        entity.getId(),
        entity.getFirstName(),
        entity.getLastName(),
        entity.getEmail()
        );
    }
  
  static PersonSummary personSummaryFrom(Person entity) {
    return new PersonSummary(
        entity.getId(),
        entity.getFirstName()+" "+entity.getLastName(),
        entity.getEmail()
        );
    }
    
  static Collection<PersonSummary> personSummariesFrom(Collection<Person> entities) {
    Collection<PersonSummary> summaries = new ArrayList<>();
    for (Person entity : entities) summaries.add(personSummaryFrom(entity));
    return summaries;
    }
  
  
 
  }
