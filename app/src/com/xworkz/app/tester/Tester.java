package com.xworkz.app.tester;

import com.xworkz.app.dto.*;

public class Tester {
    public static void main(String[] args) {
        TechnicalSkills technicalSkills = new TechnicalSkills("java");
        EmployeeDetails employeeDetails = new EmployeeDetails("vivek","blore");
        Department department = new Department(1000,"development",employeeDetails);
        Company company = new Company("vv","tumkur",department);

        WebApplication webApplication = new WebApplication("myeyes",technicalSkills,company);
        System.out.println(webApplication);
        System.out.println(webApplication.getCompany().getDepartment().getEmployeeDetails().getEmployeeName());

        AndroidApplication androidApplication = new AndroidApplication("myeyes",technicalSkills,company);
        System.out.println(androidApplication);
        System.out.println(androidApplication.getCompany().getDepartment().getEmployeeDetails().getEmployeeName());

        IotApplication iotApplication = new IotApplication("myeyes",technicalSkills,company);
        System.out.println(iotApplication);
        System.out.println(iotApplication.getCompany().getDepartment().getEmployeeDetails().getEmployeeName());

        EnterpriseApplication enterpriseApplication = new EnterpriseApplication("myeyes",technicalSkills,company);
        System.out.println(enterpriseApplication);
        System.out.println(enterpriseApplication.getCompany().getDepartment().getEmployeeDetails().getEmployeeName());
    }
}
