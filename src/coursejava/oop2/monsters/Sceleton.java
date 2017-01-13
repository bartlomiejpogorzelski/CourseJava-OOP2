
package coursejava.oop2.monsters;



public class Sceleton extends Monster {
    @Override
    public void attack()
    {                                   //this method is overloaded by method(attack(String type...)
        System.out.println("Override");
    }
    public void attack(String typeOfAttack)
    {
        super.attack();//if we want use method attack() from class parent
        System.out.println("I'm method from sceleton"); 
    }
    public Sceleton()
    {
        System.out.println("I'm from empty sceleton constructor");
    }
    
    public Sceleton(double hitPoits, double speed)
    {
        super(hitPoits,speed); // super... is the same like in class monster:  
                               //this.hitPoints=hitPoints;
                               // this.speed=speed;
        System.out.println("I'm from Sceleton constructor with 2 arguments");
    }
    void whatever()
    {
        
    }
    
    String typeOfAttack;
    public Sceleton(double hitPoits, double speed, String typeOfAttack)
    {
        super(hitPoits,speed); 
        this.typeOfAttack=typeOfAttack;
        System.out.println("I'm from Sceleton constructor with 3 arguments");
    }
    
    public void test2()
    {
        System.out.println("TEST-2");
    }
    
}
