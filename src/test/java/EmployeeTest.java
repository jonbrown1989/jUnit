import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee employee;
    public static final String FIRSTNAME = "Ted";
    public static final String LASTNAME = "Tester";
    public static final int SALARY = 5000;

    @BeforeEach
    void setUp() {
        employee = new Employee(FIRSTNAME, LASTNAME, SALARY);
    }

    @Test
    void getFirstName() {
        assertEquals("Ted", employee.getFirstName());
    }

    @Test
    void setFirstName() {
        employee.setFirstName("Fred");
        assertEquals("Fred", employee.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Tester", employee.getLastName());
    }

    @Test
    void setLastName() {
        employee.setLastName("Fester");
        assertEquals("Fester", employee.getLastName());
    }

    @Test
    void getSalary() {
        assertEquals(5000, employee.getSalary());
    }

    @Test
    void setSalary() {
        employee.setSalary(9999);
        assertEquals(9999, employee.getSalary());

    }

    @Test
    void giveRaise() {
        assertEquals(10000, employee.giveRaise(100));
    }

    @Test
    @DisplayName("Test various Employee methods in sequence")
    void EmployeeSequence() {
        employee = new Employee("Jon", "Brown", 9991);
        assertEquals(9991, employee.getSalary());
        assertEquals("Jon", employee.getFirstName());
        assertEquals("Brown", employee.getLastName());
        assertEquals(14986.5, employee.giveRaise(50));

    }
}