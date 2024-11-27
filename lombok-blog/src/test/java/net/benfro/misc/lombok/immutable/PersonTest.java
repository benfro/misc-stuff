package net.benfro.misc.lombok.immutable;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testCreate() {
        Person person = new Person("id", "fullName");
        assertEquals("id", person.getId());
        assertEquals("fullName", person.getFullName());
    }

    @Test
    void testEquals() {
        Person person1 = new Person("id", "fullName");
        Person person2 = new Person("id", "fullName");
        assertEquals(person1, person2);
    }
}
