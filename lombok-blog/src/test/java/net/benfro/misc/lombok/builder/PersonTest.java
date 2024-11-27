package net.benfro.misc.lombok.builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testBuilder() {
        var person= Person.builder()
            .id("id")
            .fullName("fullName")
            .build();
        assertEquals("id", person.getId());
        assertEquals("fullName", person.getFullName());
    }

    @Test
    void testBuilderDefaults() {
        var person= Person.builder()
            .id("id")
            .build();
        assertEquals("id", person.getId());
        assertEquals("Jane Doe", person.getFullName());
    }
}
