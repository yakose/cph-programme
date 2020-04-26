package dk.cphbusiness.example.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "PEOPLE")
@SequenceGenerator(name = "SEQ", sequenceName = "Person_Sequence", initialValue = 10000)
@NamedQueries({
    @NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p")
    })
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
    private Integer id;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LAST_NAME")
    private String lastName;

    @Size(max = 40)
    @Column(name = "EMAIL")
    private String email;

    public Person() { }

    public Person(Integer id) {
        this.id = id;
        }

    public Person(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        }

    public Integer getId() { return id; }

    public void setId(Integer value) { id = value; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String value) { firstName = value; }

    public String getLastName() { return lastName; }

    public void setLastName(String value) { lastName = value; }

    public String getEmail() { return email; }

    public void setEmail(String value) { email = value; }

    @Override
    public int hashCode() {
        return (id != null ? id.hashCode() : 0);
        }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Person)) return false;
        Person other = (Person) object;
        return this.id.equals(other.id);
        }

    @Override
    public String toString() {
        return "dk.cphbusiness.example.model.Person[ id=" + id + " ]";
        }
    
    }
