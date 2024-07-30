package com.corejava.variable.Datatype;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Log4j2
public class Marks {

    private int totalMarks;
    private float aggregateMarks;

    public Marks(int marks1, float marks2) {
        this.totalMarks = marks1;
        this.aggregateMarks = marks2;
    }

    public void printMarksDetails() {
        log.info("total :"+totalMarks+"Aggregate :"+aggregateMarks);
    }
}
