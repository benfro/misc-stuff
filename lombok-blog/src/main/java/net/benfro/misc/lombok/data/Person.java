package net.benfro.misc.lombok.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Person {
    private int age;
    private final String socialSecurityNumber;
}
