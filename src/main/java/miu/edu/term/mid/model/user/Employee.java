package miu.edu.term.mid.model.user;


import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("3")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Employee extends Person {



    private String badgeNumber;

}
