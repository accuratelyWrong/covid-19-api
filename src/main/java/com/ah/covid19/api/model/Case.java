package com.ah.covid19.api.model;

import java.util.Date;

public class Case {
    private final Date date;
    private final int accumulatedCases;
    private final int newCases;

    public Case(Date date, int accumulatedCases, int newCases) {
        this.date = date;
        this.accumulatedCases = accumulatedCases;
        this.newCases = newCases;
    }

    public Date getDate() {
        return date;
    }

    public int getAccumulatedCases() {
        return accumulatedCases;
    }

    public int getNewCases() {
        return newCases;
    }
}
