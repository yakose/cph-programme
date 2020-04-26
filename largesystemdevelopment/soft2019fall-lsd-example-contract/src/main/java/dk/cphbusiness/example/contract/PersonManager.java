package dk.cphbusiness.example.contract;

import dk.cphbusiness.example.contract.dto.PersonDetail;
import dk.cphbusiness.example.contract.dto.PersonIdentifier;
import dk.cphbusiness.example.contract.dto.PersonSummary;
import java.util.Collection;
import javax.ejb.Remote;

@Remote
public interface PersonManager {
    
    String hello(String name);
    
    Collection<PersonSummary> list();
    
    PersonDetail find(PersonIdentifier identifier);
    
    PersonDetail save(PersonDetail detail);
    
    }
