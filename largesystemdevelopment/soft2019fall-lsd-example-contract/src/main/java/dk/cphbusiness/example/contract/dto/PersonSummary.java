package dk.cphbusiness.example.contract.dto;

public class PersonSummary extends PersonIdentifier {
    private final String name;
    private final String email;
    
    public PersonSummary(int id, String name, String email) {
        super(id);
        this.name = name;
        this.email = email;
        }
    
    public String getName() { return name; }
    
    public String getEmail() { return email; }
    
    }
