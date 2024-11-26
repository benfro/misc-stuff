package net.benfro.misc.lombok.constructor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor( staticName = "of")
@Getter
public class AllArgsPerson {
    private int age;
    private final String socialSecurityNumber;
    // ...
}
