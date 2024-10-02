package net.benfro.misc.lombok.immutable;

import java.util.Collection;

import lombok.Value;

@Value
public class Author {
    private final String id;
    private final String fullName;
    private final Collection<Publication> publications;
}
