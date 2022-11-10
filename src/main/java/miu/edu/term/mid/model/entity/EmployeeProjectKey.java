package miu.edu.term.mid.model.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class EmployeeProjectKey implements Serializable {
    private Integer employeeId;
    private Integer projectId;
}
