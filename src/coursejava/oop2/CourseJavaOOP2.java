
package coursejava.oop2;

import java.util.Date;


public class CourseJavaOOP2 {

    public static void main(String[] args) {
   
    final double PI= 3.14;
    //PI= 5.55; //we cannot change the value beacuse is use final
    Employee e= new Employee();
        System.out.println(e.dateOfEmployment);
            
    }
}
    abstract class Person 
    {
        
    }
    
    class Employee extends Person
    {
        final Date dateOfEmployment;
        
        Employee()
        {
            this.dateOfEmployment= new Date(); 
        }
        
        Employee(Date d)
        {
         this.dateOfEmployment=d;
        }
        
        
        
    }
    
   
