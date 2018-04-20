package com.company;

public class TheGoGetTersResume {

    String Name;
    String Skills;
    String Education;
    String Experence;

    TheGoGetTersResume(String Name, String Skills, String Education, String Experence) {
        this.Name = Name;
        this.Skills = Skills;
        this.Education = Education;
        this.Experence = Experence;
    }

    void catagories() {
        System.out.println("Name: " + this.Name + "Skills: " + this.Skills + "Education: " + this.Education + "Experence" + this.Experence);
    }

    public static void main(String[] args) {
        TheGoGetTersResume resume = new TheGoGetTersResume("Christian Walker",
                "JavaScript, HTML/CSS, React, C, Python",
                "Bachelors in Computer Engineer from Clemson University", "Shift Manager at Wendys");

        resume.catagories();
    }

}

