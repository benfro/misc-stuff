package net.benfro.misc.lombok.constructor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AllArgsPersonTest {

    @Test
    void testAllArgsConstructor() {
        var person = AllArgsPerson.of(42, "12121212-1212");
        assertEquals(42, person.getAge());
        assertEquals("12121212-1212", person.getSocialSecurityNumber());
    }
}
