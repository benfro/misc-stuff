package net.benfro.misc.lombok.javabean.data;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
public class Author {
    private String id;
    private String fullName;
    private Collection<Publication> publications;
}
