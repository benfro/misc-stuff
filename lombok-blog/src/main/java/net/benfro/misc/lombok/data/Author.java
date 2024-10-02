package net.benfro.misc.lombok.data;

import java.util.Collection;

public class Author {
    private String id;
    private String fullName;
    private Collection<Publication> publications;
}
