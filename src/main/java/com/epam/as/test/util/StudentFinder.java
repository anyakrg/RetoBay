package com.epam.as.test.util;

import com.epam.as.test.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFinder {
    private static StringBuilder str = new StringBuilder();
    private final static Logger log = LoggerFactory.getLogger(Student.class);

    public static List<Student> findByGroup(int group) {
        List<Student> list = new ArrayList<Student>();
        int gr = 0;
        File inputFile = new File("src/main/input.txt");

        try {
            FileReader fr = new FileReader(inputFile);
            log.info("input.txt opened");
            Scanner scan = new Scanner(fr);
            while (scan.hasNext()) {
                if (scan.hasNextInt()) {
                    gr = Integer.parseInt(scan.next());
                }
                if (group == gr) {
                    list.add(new Student(scan.next(), gr));
                    log.info("Student find by group:" + gr);
                } else scan.next();
            }

            fr.close();
        } catch (FileNotFoundException e) {
            log.error("FileNotFoundException cant open file /input.txt");
        } catch (IOException e) {
            log.error("IOException:");
        }
        write(list);
        return list;
    }

    private static void write(List<Student> list) {
        File outputFile = new File("output.txt");
        try {
            FileWriter writer = new FileWriter(outputFile);
            for (Student student : list) {
                writer.write(student.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            log.error("IOException:");
        }
    }
}
