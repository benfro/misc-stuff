package net.benfro.misc.lombok.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testRequiredArgsConstructor() {
        var person = new Person("13131313-1313");
        person.setAge(22);
        assertEquals(22, person.getAge());
        assertEquals("13131313-1313", person.getSocialSecurityNumber());
    }

    @Test
    void testAllArgsConstructor() {
        var person = new Person(22, "13131313-1313");
        assertEquals(22, person.getAge());
        assertEquals("13131313-1313", person.getSocialSecurityNumber());
    }
}
