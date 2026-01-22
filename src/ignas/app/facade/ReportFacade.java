package ignas.app.facade;

import ignas.app.builder.Report;
import ignas.app.chain.Handler;
import ignas.app.iterator.SectionIterator;
import ignas.app.strategy.Formatter;

public class ReportFacade {
    private final Handler chain;
    private final Formatter formatter;

    public ReportFacade(Handler chain, Formatter formatter) {
        this.chain = chain;
        this.formatter = formatter;
    }

    public void generateReport(Report report) {
        chain.handle(report, "LogTitle");
        chain.handle(report, "CountSections");

        SectionIterator iterator = new SectionIterator(report.getSections());
        while (iterator.hasNext()) {
            System.out.println(formatter.format(iterator.next()));
        }
    }
}
