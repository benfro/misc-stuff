package net.benfro.misc.lombok.tostring;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Person {
    @ToString.Exclude
    private int age;
    private String fullName;
    // ...
}
