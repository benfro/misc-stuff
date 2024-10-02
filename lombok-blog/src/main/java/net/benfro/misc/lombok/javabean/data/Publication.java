package net.benfro.misc.lombok.javabean.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class Publication {

    public enum Category {
        NOVEL, ESSAY, SHORT_STORY;
    }

    private final String title;
    private final Category category;
    private float averageRating;
}
