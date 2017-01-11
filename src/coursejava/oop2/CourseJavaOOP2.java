
package coursejava.oop2;
    
//Packages
import coursejava.oop2.monsters.Monster;
import coursejava.oop2.monsters.Sceleton;


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
        Sceleton sceleton= new Sceleton(33,99);
        System.out.println(sceleton.hitPoints);
        System.out.println(sceleton.speed);
        sceleton.attack();
        Sceleton sceleton2= new Sceleton(20,44, "dak");
        sceleton2.attack();
    }
}