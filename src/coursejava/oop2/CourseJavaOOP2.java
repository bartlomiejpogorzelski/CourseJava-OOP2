
package coursejava.oop2;


public class CourseJavaOOP2 {

    public static void main(String[] args) {
   
    //Person person = new Person(); // this don't work
    // Person person = new Employee("s", "a", 1);
      Person people[] = new Employee[2];
      people[0]= new Employee("Arkadiusz", "wlodarczyk", 1000);
      people[1]= new Employee("ola", "wlodarczyk", 1100);
      
      people[0].description();
    }
}
    abstract class Person 
    {
        String name;
        String surname;
        
        Person()
        {
            
        }
        Person (String name, String surname)
        {
            this.name=name;
            this.surname=surname;
        }
        
        abstract void description();
    }
    
    class Employee extends Person
    {
        double salary;
        public Employee(String name, String surname, double salary)
        {
            super(name, surname);
            this.salary=salary;
        }
        @Override
        void description() {
            System.out.println("name = " + name);
            System.out.println("surname = " + surname);
        }
        
    }
    
    class Student extends Person
    {
        public Student(String name, String surname)
        {
        super(name, surname);
        }
        @Override
        void description() {
            System.out.println("name = " + name);
            System.out.println("surname = "+ surname);
        }
        
    }

