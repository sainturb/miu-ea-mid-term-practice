package miu.edu.term.mid.model.user;


import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Contact {

    private String phoneNumber;
    private String email;
}
