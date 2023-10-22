package design.decorator;

public class WarriorWithSword implements Warrior {
    public WarriorWithSword() {
        super();
    }

    @Override
    public void attack() {
        System.out.println("Warrior attacks enemy with a sword");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }
}


