package se.predictly.support.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class DeptManagerId implements Serializable {
    @Serial
    private static final long serialVersionUID = 4627702905867477379L;

    @NotNull
    @Column(name = "emp_no", nullable = false)
    private Integer empNo;

    @Size(max = 4)
    @NotNull
    @Column(name = "dept_no", nullable = false, length = 4)
    private String deptNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DeptManagerId entity = (DeptManagerId) o;
        return Objects.equals(this.empNo, entity.empNo) && Objects.equals(this.deptNo, entity.deptNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNo, deptNo);
    }

}