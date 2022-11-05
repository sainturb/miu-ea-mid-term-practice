package miu.edu.term.mid.model.object;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderNumber;
    private String description;
    private LocalDateTime orderedDate;

    @OneToMany
    @JoinColumn(name="order_id")
    @ToString.Exclude
    Set<Book> books = new HashSet<>();
}
