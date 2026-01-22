package ignas.app.iterator;

import java.util.Iterator;
import java.util.List;

public class SectionIterator implements Iterator<String> {
    private final List<String> sections;
    private int index = 0;

    public SectionIterator(final List<String> sections) {
        this.sections = sections;

    }
    @Override
    public boolean hasNext() {
        return index < sections.size();
    }

    @Override
    public String next() {
        return sections.get(index++);
    }
}
