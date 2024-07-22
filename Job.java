/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author LENOVO
 */
public class Job {
    private String category;
    private double salary;
    public Job(String c,double s){
        category=c;
        salary=s;
    }
        public String getCategory(){
            return category;
        }
        public double getSalary(){
            return salary;
    }
    public void SetCategory( String c){
        this.category=c;
    }
    public void setSalary(double s){
        this.salary=s;
    }

    @Override
    public String toString() {
        return "Job{" + "category=" + category + ", salary=" + salary + '}';
    }
}
   
        
        
    

