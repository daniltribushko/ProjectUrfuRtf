package org.example;

import org.example.CSVparser.CSVParser;
import org.example.ScourOfCourse.Report;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var pesons = CSVParser.getReportFromCSV("CSV/basicprogramming_2.csv");
        var count = 0;
        /*for(var i : pesons.getPersons()){
            count++;
        }*/

        System.out.println(pesons.getCourse());
        System.out.println("Количество студентов - " + count);
        Report report = new Report(pesons.getCourse(), pesons.getPersons());
        System.out.println(report.getStudent("Прожерин Владислав"));

    }
}