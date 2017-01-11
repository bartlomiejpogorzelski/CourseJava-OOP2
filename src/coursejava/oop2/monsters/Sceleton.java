
package coursejava.oop2.monsters;



public class Sceleton extends Monster {
    
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
    
}
