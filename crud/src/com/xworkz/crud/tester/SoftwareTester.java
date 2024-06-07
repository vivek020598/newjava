package com.xworkz.crud.tester;

import com.xworkz.crud.dto.SoftwareDto;

import java.util.ArrayList;
import java.util.List;

public class SoftwareTester {
    public static void main(String[] args) {
        List<SoftwareDto> softwareList = new ArrayList<>();

        softwareList.add(new SoftwareDto("Windows", "10", "Microsoft", "2015-07-29", "Commercial"));
        softwareList.add(new SoftwareDto("Ubuntu", "20.04", "Canonical", "2020-04-23", "Open Source"));
        softwareList.add(new SoftwareDto("MacOS", "Catalina", "Apple", "2019-10-07", "Commercial"));
        softwareList.add(new SoftwareDto("Android", "11", "Google", "2020-09-08", "Open Source"));
        softwareList.add(new SoftwareDto("iOS", "14", "Apple", "2020-09-16", "Commercial"));

        softwareList.add(new SoftwareDto("Firefox", "89.0", "Mozilla", "2021-06-01", "Open Source"));
        softwareList.add(new SoftwareDto("Chrome", "91.0", "Google", "2021-05-25", "Freeware"));
        softwareList.add(new SoftwareDto("VSCode", "1.56", "Microsoft", "2021-05-06", "Open Source"));
        softwareList.add(new SoftwareDto("IntelliJ IDEA", "2021.1", "JetBrains", "2021-04-06", "Commercial"));
        softwareList.add(new SoftwareDto("PyCharm", "2021.1", "JetBrains", "2021-04-06", "Commercial"));

        softwareList.add(new SoftwareDto("Slack", "4.16", "Slack Technologies", "2021-05-12", "Freemium"));
        softwareList.add(new SoftwareDto("Zoom", "5.6", "Zoom Video Communications", "2021-05-24", "Freemium"));
        softwareList.add(new SoftwareDto("Skype", "8.72", "Microsoft", "2021-05-06", "Freemium"));
        softwareList.add(new SoftwareDto("Dropbox", "121.4", "Dropbox, Inc.", "2021-05-25", "Freemium"));
        softwareList.add(new SoftwareDto("Spotify", "1.1.60", "Spotify Ltd.", "2021-05-21", "Freemium"));

        softwareList.add(new SoftwareDto("Notepad++", "8.0", "Don Ho", "2021-05-31", "Open Source"));
        softwareList.add(new SoftwareDto("GIMP", "2.10.24", "The GIMP Team", "2021-03-28", "Open Source"));
        softwareList.add(new SoftwareDto("Blender", "2.93", "Blender Foundation", "2021-06-02", "Open Source"));
        softwareList.add(new SoftwareDto("LibreOffice", "7.1.3", "The Document Foundation", "2021-05-06", "Open Source"));
        softwareList.add(new SoftwareDto("Apache NetBeans", "12.4", "Apache Software Foundation", "2021-05-19", "Open Source"));

        for (SoftwareDto software : softwareList) {
            System.out.println(software);
        }
    }
}
