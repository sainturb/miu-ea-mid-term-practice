package miu.edu.term.mid.model.entity;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
@Data
public class EmployeeProject {

    @EmbeddedId
    private EmployeeProjectKey key;

    @ManyToOne
    @MapsId("employeeId")
    private Employee employee;

    @ManyToOne
    @MapsId("projectId")
    private Project project;


    private Integer hours;
    private Long id;
}
