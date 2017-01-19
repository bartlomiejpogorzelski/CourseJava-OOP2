
package coursejava.oop2;

import java.util.Date;


public class CourseJavaOOP2 {

    public static void main(String[] args) {
   
    final double PI= 3.14;
    //PI= 5.55; //we cannot change the value beacuse is use final
    }
}
    abstract class Person 
    {
        
    }
    
    class Employee extends Person
    {
        //final Date dateOfEmployment //only this is bad beacuse with "final" it must be initialize
        final Date dateOfEmployment = new Date();
        
        
        
    }
    
   
