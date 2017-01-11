
package coursejava.oop2.monsters;


public class Monster //base class or super class
{
    public double hitPoints;
    public double speed;
    
    public Monster()
    {
        System.out.println("I'm constructor from Monster class");
    }
    
    public Monster(double hitPoints, double speed)
    {
        this.hitPoints=hitPoints;
        this.speed=speed;
        System.out.println("i'm constructor from Monster class with two arguments");
    }
    public void Attack()
    {
        System.out.println("I'm attacking from monster class"); 
    }
}
