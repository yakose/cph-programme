package dk.cphbusiness.example.contract.dto;

import java.io.Serializable;

public class PersonIdentifier implements Serializable {
    private final int id;
    
    public PersonIdentifier(int id) {
        this.id = id;
        }
    
    public int getId() { return id; }
    
    }
