package com.epam.java_fundamentals.oop.stationary;

public class NoteBook extends Stationery {
    private int numberOfPages;
    private PagePattern pagePattern;

    public NoteBook() {
        this("", "", 0, 0, PagePattern.BLANK);
    }

    public NoteBook(String name, String producerName, double prise, int numberOfPages, PagePattern pagePattern) {
        super(name, producerName, prise);
        this.numberOfPages = numberOfPages;
        this.pagePattern = pagePattern;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public PagePattern getPagePattern() {
        return pagePattern;
    }

    public void setPagePattern(PagePattern pagePattern) {
        this.pagePattern = pagePattern;
    }
}
