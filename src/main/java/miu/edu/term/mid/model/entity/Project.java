package miu.edu.term.mid.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
public class Project implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @Embedded
    private NameNumberKey key;

    @OneToMany(mappedBy = "project")
    private Set<EmployeeProject> employees;

}
