package miu.edu.term.mid.model.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class NameNumberKey implements Serializable {
    private String name;
    private Integer number;
}
