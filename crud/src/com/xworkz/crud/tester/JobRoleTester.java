package com.xworkz.crud.tester;

import com.xworkz.crud.dto.JobRoleDto;

import java.util.ArrayList;
import java.util.List;

public class JobRoleTester {
    public static void main(String[] args) {
        List<JobRoleDto> jobRoles = new ArrayList<>();

        jobRoles.add(new JobRoleDto("Software Engineer", "Google", "Mountain View, CA", "Full-time", 120000, "2-5 years", "Java, C++"));
        jobRoles.add(new JobRoleDto("Data Scientist", "Facebook", "Menlo Park, CA", "Full-time", 130000, "3-6 years", "Python, R"));
        jobRoles.add(new JobRoleDto("DevOps Engineer", "Amazon", "Seattle, WA", "Full-time", 115000, "2-4 years", "AWS, Docker"));
        jobRoles.add(new JobRoleDto("Product Manager", "Apple", "Cupertino, CA", "Full-time", 140000, "5-7 years", "Product Management, Agile"));
        jobRoles.add(new JobRoleDto("UX Designer", "Microsoft", "Redmond, WA", "Full-time", 110000, "3-5 years", "UI/UX Design, Figma"));

        jobRoles.add(new JobRoleDto("System Administrator", "IBM", "Armonk, NY", "Full-time", 90000, "3-6 years", "Linux, Network"));
        jobRoles.add(new JobRoleDto("Network Engineer", "Cisco", "San Jose, CA", "Full-time", 105000, "4-6 years", "Networking, Cisco"));
        jobRoles.add(new JobRoleDto("Business Analyst", "Deloitte", "New York, NY", "Full-time", 95000, "2-4 years", "Analysis, SQL"));
        jobRoles.add(new JobRoleDto("Cloud Architect", "Oracle", "Redwood City, CA", "Full-time", 135000, "5-8 years", "Cloud, Architecture"));
        jobRoles.add(new JobRoleDto("Cybersecurity Specialist", "Symantec", "Mountain View, CA", "Full-time", 125000, "4-7 years", "Cybersecurity, SIEM"));

        jobRoles.add(new JobRoleDto("AI Researcher", "OpenAI", "San Francisco, CA", "Full-time", 150000, "3-5 years", "Machine Learning, Python"));
        jobRoles.add(new JobRoleDto("QA Engineer", "Intel", "Santa Clara, CA", "Full-time", 100000, "3-5 years", "Testing, Automation"));
        jobRoles.add(new JobRoleDto("Backend Developer", "Twitter", "San Francisco, CA", "Full-time", 115000, "2-4 years", "Node.js, MongoDB"));
        jobRoles.add(new JobRoleDto("Frontend Developer", "Spotify", "Stockholm, Sweden", "Full-time", 110000, "3-5 years", "React, JavaScript"));
        jobRoles.add(new JobRoleDto("Mobile App Developer", "Snapchat", "Los Angeles, CA", "Full-time", 120000, "3-6 years", "iOS, Android"));

        jobRoles.add(new JobRoleDto("IT Support Specialist", "HP", "Palo Alto, CA", "Full-time", 85000, "1-3 years", "Support, Troubleshooting"));
        jobRoles.add(new JobRoleDto("Database Administrator", "Oracle", "Redwood City, CA", "Full-time", 125000, "4-6 years", "SQL, Oracle DB"));
        jobRoles.add(new JobRoleDto("SEO Specialist", "Moz", "Seattle, WA", "Full-time", 95000, "2-4 years", "SEO, Marketing"));
        jobRoles.add(new JobRoleDto("Game Developer", "Ubisoft", "Montreal, Canada", "Full-time", 115000, "3-5 years", "C++, Unreal Engine"));
        jobRoles.add(new JobRoleDto("IT Consultant", "Accenture", "Chicago, IL", "Full-time", 120000, "5-7 years", "Consulting, IT Strategy"));

        for (JobRoleDto jobRole : jobRoles) {
            System.out.println(jobRole);
        }
    }
}
