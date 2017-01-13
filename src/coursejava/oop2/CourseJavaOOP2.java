
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
        
        Monster m = new Sceleton();
        m.attack();
        m.test();
        //m.test2(); //This is don't work
        
        // when "m." we have access only to the class Monster 
    }
    
    static void nazwa(Monster m3)
    {
        
    }
}