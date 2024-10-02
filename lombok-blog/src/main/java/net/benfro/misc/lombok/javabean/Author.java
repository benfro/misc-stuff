package net.benfro.misc.lombok.javabean;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Author {
    private String id;
    private String fullName;
    private Collection<Publication> publications;
}
