
package coursejava.oop2;



public class CourseJavaOOP2 {

    public static void main(String[] args) {
   
    }
}
    
interface nameOfInterfaces
{
    double PI =3.14;  // public final static
    
    void sample(); // method is public and abstract 
}   

//implements means you want to take after all behaviors from the inteface 

class Employee implements nameOfInterfaces
{
    @Override
    public void sample() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
