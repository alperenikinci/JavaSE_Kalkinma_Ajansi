package week04.abstraction.abstractexample;

public class Game {



    public static void main(String[] args) throws InterruptedException {
        Enemy goblin = new Goblin();
        Enemy zombie = new Zombie();
        goblin.attack();

        long beginning = System.currentTimeMillis();
        goblin.attack();
        Thread.sleep(12000);
        zombie.attack();
        long checkpoint = (System.currentTimeMillis()-beginning)/1000;
        System.out.println(checkpoint);
        if(checkpoint>=10){
            goblin.upgradeAttack(0.1);
        }
        goblin.attack();
        zombie.takeDamage(20);
        zombie.takeDamage(30);
        zombie.takeDamage(60);
    }
}
