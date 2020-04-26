package dk.cphbusiness.example.dummy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Person {
  private static Map<Integer, Person> people = new HashMap<>();
  private static int nextId = 1;
  
  public static Collection<Person> list() {
    return people.values();
    }
  
  public static Person find(int id) {
    return people.get(id);
    }
  
  public Person(String firstName, String lastName, String email) {
    id = nextId++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    people.put(id, this);
    }
  
  
  private int id;
  private String firstName;
  private String lastName;
  private String email;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  

  }
