package miu.edu.term.mid.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
public class Employee implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String ssn;
    private String name;

    @ManyToOne
    private Department worksIn;

    @OneToMany(mappedBy = "employee")
    private Set<Dependant> dependants;

    @OneToMany(mappedBy = "employee")
    private Set<EmployeeProject> projects;
}
