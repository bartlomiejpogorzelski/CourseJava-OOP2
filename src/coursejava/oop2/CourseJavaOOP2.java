
package coursejava.oop2;
    
//Packages
import coursejava.oop2.monsters.Monster;
import coursejava.oop2.monsters.Sceleton;
import coursejava.oop2.monsters.Zombie;


public class CourseJavaOOP2 {

    public static void main(String[] args) {
    // MONSTERS - ZOMBIES - SKELETONS - hit points, attack, speed
//       Monster monster = new Monster(100,10);
//       
//       monster.Attack();
//       
//        System.out.println(monster.hitPoints);
//        System.out.println(monster.speed);
//        
        
        Monster m = new Monster();
        Sceleton s = new Sceleton();
        Zombie z = new Zombie();    // poly -many, morphism- form
        
        Monster m2= new Zombie();
        m2=new Sceleton();
        
        CourseJavaOOP2.nazwa(new Zombie());
    }
    
    static void nazwa(Monster m3)
    {
        
    }
}