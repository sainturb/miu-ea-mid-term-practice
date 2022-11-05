package miu.edu.term.mid.model.user;


import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("1")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Author extends Person {



    private Double rating;
}
