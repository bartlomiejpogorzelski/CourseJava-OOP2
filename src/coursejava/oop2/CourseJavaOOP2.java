
package coursejava.oop2;


public class CourseJavaOOP2 {

    public static void main(String[] args) {
   
    //Person person = new Person(); // this don't work
    // Person person = new Employee("s", "a", 1);
      Person people[] = new Person[3];
      people[0]= new Employee("Arkadiusz", "wlodarczyk", 1000);
      people[1]= new Student("ola", "wlodarczyk");
      
      for (int i=0; i<people.length; i++)
      {
          if( people[i] instanceof Person)
              people[i].description();
          else
          break;
      }
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
            System.out.println("salary:"+salary);
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

