package miu.edu.term.mid.model.user;


import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("2")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Customer extends Person {


    private String username;

}
