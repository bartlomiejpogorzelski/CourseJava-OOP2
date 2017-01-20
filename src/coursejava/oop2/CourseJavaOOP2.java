
package coursejava.oop2;



public class CourseJavaOOP2 {

    public static void main(String[] args) {
   
        nameOfInterfaces a = new Employee();
        
        Object b= new Employee();
    }
}
    
interface nameOfInterfaces
{
    double PI =3.14;  // public final static
    
    void sample(); // method is public and abstract 
}   

//implements means you want to take after all behaviors from the inteface 

class Employee implements nameOfInterfaces, otherOfInterface //we can implemets more interfaces 
{
    @Override
    public void sample() {
        
    }
}
interface otherOfInterface
{

}
