package ignas.app.facade;

import ignas.app.builder.Report;
import ignas.app.chain.Handler;
import ignas.app.iterator.SectionIterator;
import ignas.app.strategy.Formatter;
import ignas.app.strategy.FormatterContext;

public class ReportFacade {
    private final Handler chain;
    private final FormatterContext formatter;

    public ReportFacade(Handler chain, Formatter formatter) {
        this.chain = chain;
        this.formatter = new FormatterContext(formatter);
    }

    public void processReport(Report report) {
        chain.handle(report, "LogTitle");
        chain.handle(report, "CountSections");

        SectionIterator iterator = new SectionIterator(report.getSections());
        while (iterator.hasNext()) {
            System.out.println(formatter.apply(iterator.next()));
        }
    }
}
