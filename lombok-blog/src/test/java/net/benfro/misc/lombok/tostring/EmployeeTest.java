package net.benfro.misc.lombok.tostring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void testToString() {
        var employee = new Employee(22, "fullName", "123", 9876);
        assertTrue(employee.toString().contains("fullName=fullName"));
        assertTrue(employee.toString().contains("empNumber=123"));
        assertFalse(employee.toString().contains("salary"));
    }
}
