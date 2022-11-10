package miu.edu.term.mid.model.user;


import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@DiscriminatorValue("3")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name="emp")
public class Employee extends Person {



    private String badgeNumber;

}
