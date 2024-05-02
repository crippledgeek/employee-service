package se.predictly.support.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "dept_manager")
public class DeptManager {
    @EmbeddedId
    private DeptManagerId id;

    @MapsId("empNo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "emp_no", nullable = false)
    private Employee empNo;

    @MapsId("deptNo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "dept_no", nullable = false)
    private Department deptNo;

    @NotNull
    @Column(name = "from_date", nullable = false)
    private LocalDate fromDate;

    @NotNull
    @Column(name = "to_date", nullable = false)
    private LocalDate toDate;

}