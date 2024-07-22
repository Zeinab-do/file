/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author LENOVO
 */
public class Person {
    private String name;
    private String job;
    private int actualSalary;
    private static int totalSalaries = 0;
    private static int jobCount = 0;

    public Person(String name, String job, int actualSalary) {
        this.name = name;
        this.job = job;
        this.actualSalary = actualSalary;
        totalSalaries += actualSalary;
        jobCount++;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setActualSalary(int actualSalary) {
        totalSalaries -= this.actualSalary;
        this.actualSalary = actualSalary;
        totalSalaries += actualSalary;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getActualSalary() {
        return actualSalary;
    }

    public static int getTotalSalaries() {
        return totalSalaries;
    }

    public static int getJobCount() {
        return jobCount;
    }

    public static int getAverageSalary() {
        if (jobCount == 0) return 0;
        return totalSalaries / jobCount;
    }

    public String toString() {
        return "Name: " + name + ", " + job + ", Actual Salary: " + actualSalary + ", Total salaries: " + totalSalaries + "$";
    }
}


              