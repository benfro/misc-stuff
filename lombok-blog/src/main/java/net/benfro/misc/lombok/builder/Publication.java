package net.benfro.misc.lombok.builder;

public class Publication {

    public enum Category {
        NOVEL, ESSAY, SHORT_STORY;
    }

    private final String title;
    private final Category category;
    private float averageRating;
}
