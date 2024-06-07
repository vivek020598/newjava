package com.xworkz.crud.tester;

import com.xworkz.crud.dto.TechnologiesDto;

import java.util.LinkedList;
import java.util.List;

public class TechnologiesTester {
    public static void main(String[] args) {
        List<TechnologiesDto> technologies = new LinkedList<>();

        technologies.add(new TechnologiesDto("Java", "Programming Language", "General-purpose, class-based, object-oriented", "Java", "None", "15", "Sun Microsystems", "1995-05-23"));
        technologies.add(new TechnologiesDto("Python", "Programming Language", "High-level, interpreted, general-purpose", "Python", "None", "3.9", "Guido van Rossum", "1991-02-20"));
        technologies.add(new TechnologiesDto("JavaScript", "Programming Language", "High-level, interpreted scripting language", "JavaScript", "None", "ECMAScript 2021", "Netscape Communications Corporation", "1995-12-04"));
        technologies.add(new TechnologiesDto("HTML", "Markup Language", "Standard markup language for creating web pages", "None", "None", "HTML5", "Tim Berners-Lee", "1989-03-12"));
        technologies.add(new TechnologiesDto("CSS", "Style Sheet Language", "Style sheet language used for describing the presentation of a document written in HTML", "None", "None", "CSS3", "Håkon Wium Lie, Bert Bos", "1996-12-17"));

        technologies.add(new TechnologiesDto("React", "JavaScript Library", "A JavaScript library for building user interfaces", "JavaScript", "React", "17.0.2", "Facebook", "2013-05-29"));
        technologies.add(new TechnologiesDto("Spring", "Framework", "Application framework and inversion of control container", "Java", "Spring", "5.3.9", "Pivotal Software", "2003-03-24"));
        technologies.add(new TechnologiesDto("Angular", "JavaScript Framework", "Platform for building mobile and desktop web applications", "JavaScript", "Angular", "12.0.4", "Google", "2016-09-14"));
        technologies.add(new TechnologiesDto("Node.js", "JavaScript Runtime Environment", "Asynchronous event-driven JavaScript runtime", "JavaScript", "Node.js", "14.17.3", "Ryan Dahl", "2009-05-27"));
        technologies.add(new TechnologiesDto("MongoDB", "Database", "NoSQL document-oriented database program", "None", "MongoDB", "5.1.2", "MongoDB Inc.", "2009-02-11"));

        technologies.add(new TechnologiesDto("Docker", "Containerization Platform", "Platform for developing, shipping, and running applications", "None", "Docker", "20.10.7", "Docker Inc.", "2013-03-20"));
        technologies.add(new TechnologiesDto("Kubernetes", "Container Orchestration Platform", "Open-source container orchestration system", "None", "Kubernetes", "1.21.2", "Google", "2014-06-06"));
        technologies.add(new TechnologiesDto("AWS", "Cloud Services Platform", "Amazon Web Services cloud computing platform", "None", "AWS", "N/A", "Amazon", "2006-03-14"));
        technologies.add(new TechnologiesDto("Azure", "Cloud Computing Service", "Microsoft's cloud computing service", "None", "Azure", "N/A", "Microsoft", "2010-02-01"));
        technologies.add(new TechnologiesDto("Google Cloud", "Cloud Computing Service", "Google's cloud computing services", "None", "Google Cloud", "N/A", "Google", "2008-04-07"));

        technologies.add(new TechnologiesDto("Git", "Version Control System", "Distributed version control system", "None", "Git", "2.32.0", "Linus Torvalds", "2005-04-07"));
        technologies.add(new TechnologiesDto("Jenkins", "Automation Server", "Open-source automation server", "Java", "Jenkins", "2.303.1", "Kohsuke Kawaguchi", "2011-02-02"));
        technologies.add(new TechnologiesDto("Maven", "Build Automation Tool", "Build automation tool used primarily for Java projects", "Java", "Maven", "3.8.1", "Apache Software Foundation", "2004-07-13"));
        technologies.add(new TechnologiesDto("JUnit", "Unit Testing Framework", "Unit testing framework for Java programming language", "Java", "JUnit", "5.8.0", "Erich Gamma", "2000-10-07"));
        technologies.add(new TechnologiesDto("PostgreSQL", "Database Management System", "Object-relational database management system", "None", "PostgreSQL", "13.3", "PostgreSQL Global Development Group", "1996-07-08"));

        for (TechnologiesDto tech : technologies) {
            System.out.println(tech);
        }
    }
}
