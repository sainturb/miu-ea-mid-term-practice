package miu.edu.term.mid.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Dependant {

    @Id
    @GeneratedValue
    private Integer id;

    private String fullname;

    @ManyToOne
    private Employee employee;
}
