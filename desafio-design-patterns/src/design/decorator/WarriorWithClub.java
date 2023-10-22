package design.decorator;

public class WarriorWithClub implements Warrior {
    public WarriorWithClub() {
        super();
    }

    @Override
    public void attack() {
        System.out.println("Warrior attacks enemy with a club");
    }

    @Override
    public int getAttackPower(){
        return 15;
    }

}
