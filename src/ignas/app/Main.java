package ignas.app;

import ignas.app.builder.Report;
import ignas.app.chain.Handler;
import ignas.app.chain.ReportSectionCount;
import ignas.app.chain.ReportTitleHandler;
import ignas.app.facade.ReportFacade;
import ignas.app.strategy.Formatter;
import ignas.app.strategy.PlainTextFormater;
import ignas.app.strategy.UpperCaseFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, demo is starting!\n");
        Report report = new Report.Builder()
                .title("Patterns Demo")
                .addSection("Builder")
                .addSection("Strategy")
                .addSection("Chain of Responsibility")
                .addSection("Facade")
                .addSection("Iterator")
                .build();

        Handler chain = new ReportTitleHandler();
        Handler chain2 = new ReportSectionCount();
        chain.setNext(chain2);

        Formatter upperCaseFormatter = new UpperCaseFormatter();
        Formatter plainFormatter = new PlainTextFormater();
        new ReportFacade(chain, upperCaseFormatter).processReport(report);

        System.out.println();

        new ReportFacade(chain, plainFormatter).processReport(report);

    }
}
