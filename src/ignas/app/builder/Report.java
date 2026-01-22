package ignas.app.builder;

import java.util.ArrayList;
import java.util.List;

public class Report {

    private final String title;
    private final List<String> sections;

    private Report(Builder builder) {
        this.title = builder.title;
        this.sections = builder.sections;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getSections() {
        return sections;
    }

    public static class Builder {
        private String title;
        private List<String> sections = new ArrayList<>();

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder addSection(String section) {
            sections.add(section);
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }
}