package net.benfro.misc.lombok.builder;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Person {
    private String id;
    private String fullName;
}
