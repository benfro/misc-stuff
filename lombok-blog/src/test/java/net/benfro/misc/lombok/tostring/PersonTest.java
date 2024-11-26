package net.benfro.misc.lombok.tostring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testToString() {
        var person = new Person(22, "fullName");
        assertTrue(person.toString().contains("fullName=fullName"));
    }
}
