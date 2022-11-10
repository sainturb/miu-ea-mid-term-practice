package miu.edu.term.mid.model.entity;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
public class Department {

    @EmbeddedId
    private NameNumberKey key;

    @OneToMany(mappedBy = "worksIn")
    private Set<Employee> employees;

}
