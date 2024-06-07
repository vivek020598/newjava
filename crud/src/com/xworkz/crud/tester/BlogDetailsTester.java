package com.xworkz.crud.tester;

import com.xworkz.crud.dto.BlogDetailsDto;

import java.util.LinkedList;
import java.util.List;

public class BlogDetailsTester {
    public static void main(String[] args) {
        List<BlogDetailsDto> blogs = new LinkedList<>();

        blogs.add(new BlogDetailsDto("Introduction to Spring Boot", "John Doe", "Spring Boot is a powerful tool for building Spring-based applications quickly and with minimal configuration.", "Java", "Spring, Spring Boot", "Technology", "USA", 100, 5000));
        blogs.add(new BlogDetailsDto("Getting Started with React", "Jane Smith", "React is a JavaScript library for building user interfaces.", "JavaScript", "React, Frontend", "Technology", "USA", 150, 7000));
        blogs.add(new BlogDetailsDto("Python Basics: Variables and Data Types", "Alice Johnson", "Learn the basics of Python programming language including variables and data types.", "Python", "Python, Basics", "Technology", "USA", 120, 6000));
        blogs.add(new BlogDetailsDto("Introduction to Docker Containers", "Robert Brown", "Docker containers provide a consistent environment for developing, shipping, and running applications.", "DevOps", "Docker, Containers", "Technology", "USA", 200, 8000));
        blogs.add(new BlogDetailsDto("Machine Learning Algorithms: An Overview", "Michael Davis", "Explore various machine learning algorithms and their applications.", "Machine Learning", "Machine Learning, Algorithms", "Technology", "USA", 180, 7500));
        blogs.add(new BlogDetailsDto("10 Tips for Effective Time Management", "Mary Wilson", "Discover practical tips to improve your time management skills.", "Self-Improvement", "Time Management, Productivity", "Self Improvement", "USA", 250, 10000));
        blogs.add(new BlogDetailsDto("Introduction to AWS Cloud Services", "Patricia Moore", "Learn about the various cloud services offered by Amazon Web Services.", "Cloud Computing", "AWS, Cloud Services", "Technology", "USA", 220, 9000));
        blogs.add(new BlogDetailsDto("Creating RESTful APIs with Spring Boot", "David Taylor", "Build RESTful APIs using Spring Boot framework.", "Java", "Spring Boot, RESTful APIs", "Technology", "USA", 280, 12000));
        blogs.add(new BlogDetailsDto("Introduction to Blockchain Technology", "Linda Anderson", "Understand the basics of blockchain technology and its potential applications.", "Blockchain", "Blockchain, Technology", "Technology", "USA", 300, 11000));
        blogs.add(new BlogDetailsDto("Essential Tips for Successful Blogging", "James Thomas", "Learn key strategies for creating and maintaining a successful blog.", "Blogging", "Blogging, Tips", "Blogging", "USA", 270, 9500));
        blogs.add(new BlogDetailsDto("Understanding React Hooks", "Christopher Martin", "Explore React hooks and how they simplify state management in functional components.", "JavaScript", "React, Hooks", "Technology", "USA", 320, 13000));
        blogs.add(new BlogDetailsDto("Introduction to Agile Methodology", "Barbara Martinez", "Learn about Agile methodology and its principles for software development.", "Software Development", "Agile, Methodology", "Technology", "USA", 350, 14000));
        blogs.add(new BlogDetailsDto("Deep Learning: An Overview", "Richard Garcia", "Gain insights into deep learning techniques and architectures.", "Deep Learning", "Deep Learning, Neural Networks", "Technology", "USA", 330, 13500));
        blogs.add(new BlogDetailsDto("Essential Tools for DevOps Engineers", "Susan Rodriguez", "Discover essential tools and technologies used in DevOps practices.", "DevOps", "DevOps, Tools", "Technology", "USA", 370, 15000));
        blogs.add(new BlogDetailsDto("Introduction to Kotlin Programming Language", "Joseph Hernandez", "Learn the basics of Kotlin programming language and its features.", "Kotlin", "Kotlin, Basics", "Technology", "USA", 340, 12500));
        blogs.add(new BlogDetailsDto("10 Healthy Habits for a Productive Lifestyle", "Sarah Lee", "Discover healthy habits to boost productivity and overall well-being.", "Self-Improvement", "Productivity, Lifestyle", "Self Improvement", "USA", 390, 16000));
        blogs.add(new BlogDetailsDto("Introduction to Microservices Architecture", "Charles Walker", "Explore the concept of microservices architecture and its benefits.", "Software Architecture", "Microservices, Architecture", "Technology", "USA", 360, 14500));
        blogs.add(new BlogDetailsDto("Introduction to GraphQL: A Query Language for APIs", "Karen Hall", "Learn about GraphQL and its advantages for building APIs.", "API Development", "GraphQL, API", "Technology", "USA", 400, 17000));
        blogs.add(new BlogDetailsDto("Introduction to Cybersecurity", "Nancy Allen", "Understand the fundamentals of cybersecurity and its importance in modern technology.", "Cybersecurity", "Cybersecurity, Basics", "Technology", "USA", 380, 15500));
        blogs.add(new BlogDetailsDto("Tips for Effective Remote Team Collaboration", "Daniel Young", "Discover strategies for improving collaboration in remote teams.", "Remote Work", "Remote Work, Collaboration", "Technology", "USA", 420, 17500));

        for (BlogDetailsDto blog : blogs) {
            System.out.println(blog);
        }
    }
}
