package se.predictly.support.employee.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import se.predictly.support.employee.exception.EmployeeNotFoundException;
import se.predictly.support.employee.model.internal.Gender;
import se.predictly.support.employee.repositories.EmployeeRepository;

@ExtendWith(MockitoExtension.class)
class ExternalEmployeeServiceTest {

    @Mock
    private EmployeeRepository repo;

    @InjectMocks
    private ExternalEmployeeService service;
    
    @Test
    void testEmployeeFound() throws ParseException {
        given(repo.findById(10)).willReturn(Optional.of(employee()));

        se.predictly.support.employee.model.internal.Employee vo = service.getEmployee(10);
        assertThat(vo).isNotNull();
        assertThat(vo.getFirstName()).isEqualTo("First");
        assertThat(vo.getLastName()).isEqualTo("Last");
        assertThat(vo.getEmployeeId()).isEqualTo(10);
        assertThat(vo.getGender()).isEqualTo(Gender.FEMALE);
    }
    
    @Test
    void testEmployeeFoundNotFound() throws ParseException {
        given(repo.findById(11)).willReturn(Optional.ofNullable(null));

        assertThrows(EmployeeNotFoundException.class, () -> service.getEmployee(11));
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
