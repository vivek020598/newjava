package com.xworkz.crud.tester;

import com.xworkz.crud.dto.BranchDto;

import java.util.LinkedList;
import java.util.List;

public class BranchTester {
    public static void main(String[] args) {
        List<BranchDto> branches = new LinkedList<>();

        branches.add(new BranchDto("Central", "John Doe", "New York", 150, "+1-212-555-1234", "1999-01-01"));
        branches.add(new BranchDto("West", "Jane Smith", "San Francisco", 100, "+1-415-555-5678", "2005-06-15"));
        branches.add(new BranchDto("East", "Alice Johnson", "Boston", 120, "+1-617-555-9012", "2001-09-10"));
        branches.add(new BranchDto("North", "Robert Brown", "Chicago", 130, "+1-312-555-3456", "2010-04-20"));
        branches.add(new BranchDto("South", "Michael Davis", "Miami", 110, "+1-305-555-7890", "2012-11-05"));

        branches.add(new BranchDto("Midwest", "Mary Wilson", "Dallas", 90, "+1-214-555-2345", "2015-07-22"));
        branches.add(new BranchDto("Southwest", "Patricia Moore", "Phoenix", 85, "+1-602-555-6789", "2018-03-18"));
        branches.add(new BranchDto("Northwest", "David Taylor", "Seattle", 95, "+1-206-555-0123", "2020-01-30"));
        branches.add(new BranchDto("Northeast", "Linda Anderson", "Philadelphia", 105, "+1-215-555-4567", "2008-05-12"));
        branches.add(new BranchDto("Southeast", "James Thomas", "Atlanta", 115, "+1-404-555-8910", "2011-08-25"));

        branches.add(new BranchDto("Pacific", "Christopher Martin", "Los Angeles", 140, "+1-213-555-1234", "2000-03-15"));
        branches.add(new BranchDto("Atlantic", "Barbara Martinez", "Washington, D.C.", 125, "+1-202-555-5678", "2003-12-01"));
        branches.add(new BranchDto("Mountain", "Richard Garcia", "Denver", 80, "+1-303-555-9012", "2016-09-20"));
        branches.add(new BranchDto("Plains", "Susan Rodriguez", "Kansas City", 75, "+1-816-555-3456", "2017-10-05"));
        branches.add(new BranchDto("Great Lakes", "Joseph Hernandez", "Detroit", 115, "+1-313-555-7890", "2009-02-15"));

        branches.add(new BranchDto("Appalachian", "Sarah Lee", "Pittsburgh", 70, "+1-412-555-2345", "2014-06-30"));
        branches.add(new BranchDto("Desert", "Charles Walker", "Las Vegas", 65, "+1-702-555-6789", "2019-04-10"));
        branches.add(new BranchDto("Bay Area", "Karen Hall", "San Jose", 90, "+1-408-555-0123", "2013-05-05"));
        branches.add(new BranchDto("Capital", "Nancy Allen", "Austin", 100, "+1-512-555-4567", "2007-11-20"));
        branches.add(new BranchDto("Lakes", "Daniel Young", "Minneapolis", 105, "+1-612-555-8910", "2006-03-25"));

        for (BranchDto branch : branches) {
            System.out.println(branch);
        }
    }
}
