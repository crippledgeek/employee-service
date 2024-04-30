package se.predictly.support.employee.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.*;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import se.predictly.support.employee.entity.Employee;
import se.predictly.support.employee.mapper.EmployeeMapper;

class EmployeeMapperTest {

    @Test
    void testMap() throws ParseException {
        Employee e = employee();
        EmployeeVO vo = EmployeeMapper.map(e);
        assertThat(vo).isNotNull();
        assertThat(vo.getEmployeeId()).isEqualTo(10);
        assertThat(vo.getBirthDate()).isEqualTo("2000-10-10");
        assertThat(vo.getHireDate()).isEqualTo("2010-01-16");
    }

    private Employee employee() throws ParseException {
        Employee e = new Employee();
        e.setEmployeeId(10);
        e.setFirstName("First");
        e.setLastName("Last");
        e.setGender("F");
        e.setHireDate(LocalDate.of(2010, 1, 16));
        e.setBirthDate(LocalDate.of(2000, 10, 10));
        return e;
    }
}
