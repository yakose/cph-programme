package dk.cphbusiness.example.backend;

import javax.ejb.Stateless;
import dk.cphbusiness.example.contract.PersonManager;
import dk.cphbusiness.example.contract.dto.PersonDetail;
import dk.cphbusiness.example.contract.dto.PersonIdentifier;
import dk.cphbusiness.example.contract.dto.PersonSummary;
import dk.cphbusiness.example.model.Person;
import static dk.cphbusiness.example.backend.PersonConverter.*;
import java.util.Collection;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
@LocalBean
public class PersonManagerBean implements PersonManager {
    
  @PersistenceContext(unitName = "my_persistence_unit")
  private EntityManager em;

  @Override
  public String hello(String name) {
    em.flush();
    
    return "Hello "+name+" from PersonManagerBean";
    }

  @Override
  public Collection<PersonSummary> list() {
    Query query = em.createNamedQuery("Person.findAll");
    Collection<Person> people = query.getResultList();
    return personSummariesFrom(people);
    }

  @Override
  public PersonDetail find(PersonIdentifier identifier) {
    return personDetailFrom(em.find(Person.class, identifier.getId()));
    }

  @Override
  public PersonDetail save(PersonDetail detail) {
    Person person;
    if (detail.getId() == 0) { // Create
      person = new Person(
        detail.getId(),
        detail.getFirstName(),
        detail.getLastName()
        );
      person.setEmail(detail.getEmail());
      }
    else { // Update
      person = em.find(Person.class, detail.getId());
      if (person == null) throw new IllegalArgumentException("id must exist or be 0");
      person.setFirstName(detail.getFirstName());
      person.setLastName(detail.getLastName());
      person.setEmail(detail.getEmail());
      }
    em.persist(person);
    em.flush();
    return personDetailFrom(person);
    }
    
  }
