import design.decorator.Enemy;
import design.decorator.WarriorWithClub;
import design.decorator.WarriorWithSword;

public class Main {
    public static void main(String[] args) {
        var warriorWithSword = new WarriorWithSword();
        var warriorWithClub = new WarriorWithClub();
        Enemy enemy = new Enemy();

        warriorWithSword.attack();
        if(warriorWithSword.getAttackPower()>enemy.getLife()) {
            System.out.println("The enemy is dead.");
        } else {
            System.out.println("The warrior is dead");
        }

        warriorWithClub.attack();
        if(warriorWithClub.getAttackPower()>enemy.getLife()) {
            System.out.println("The enemy is dead.");
        } else {
            System.out.println("The warrior is dead");
        }
    }
}