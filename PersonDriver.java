/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Person;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[4];

        // Input loop to create Persons
        for (int i = 0; i < persons.length; i++) {
            System.out.print("Enter Person information (Name Job ActualSalary): ");
            String name = scanner.next();
            String job = scanner.next();
            int actualSalary = scanner.nextInt();
            persons[i] = new Person(name, job, actualSalary);
        }

        // Change job of the first Person
        persons[0].setJob("Eng 1500");

        // Display actual salary of every person
        System.out.println("The actual salary of every person:");
        for (Person person : persons) {
            System.out.println(person.getActualSalary() + " $");
        }

        // Display the average of all salaries
        int averageSalary = Person.getAverageSalary();
        System.out.println("The average of all salaries of all the persons: " + averageSalary + " $");

        // Display the name of the Person with the maximum actual salary
        int maxSalary = Integer.MIN_VALUE;
        String personWithMaxSalary = "";
        for (Person person : persons) {
            if (person.getActualSalary() > maxSalary) {
                maxSalary = person.getActualSalary();
                personWithMaxSalary = person.getName();
            }
        }
        System.out.println("The Person with the maximum actual salary: " + personWithMaxSalary);

        // Add 100$ to the actual salary of all the Person’s work "Engineer"
        for (Person person : persons) {
            if (person.getJob().equals("Engineer")) {
                person.setActualSalary(person.getActualSalary() + 100);
            }
        }

        // Display a full description of all the Persons
        System.out.println("The description of all the persons:");
        for (Person person : persons) {
            System.out.println(person.toString());
        }

    
    }
}
          
      
      
    
    

