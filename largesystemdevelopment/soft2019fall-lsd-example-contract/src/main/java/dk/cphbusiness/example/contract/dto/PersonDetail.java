package dk.cphbusiness.example.contract.dto;

public class PersonDetail extends PersonIdentifier {
  private String firstName;
  private String lastName;
  private String email;

  public PersonDetail(int id, String firstName, String lastName, String email) {
    super(id);
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    }
    
  public String getFirstName() { return firstName; }
  
  public void setFirstName(String value) { firstName = value; }
  
  public String getLastName() { return lastName; }
  
  public void setLastName(String value) { lastName = value; }
  
  public String getEmail() { return email; }
  
  public void setEmail(String value) { email = value; }
    
  }
