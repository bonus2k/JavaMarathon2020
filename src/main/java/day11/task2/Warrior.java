package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        super(100, 80, 0, 30, 0);
    }

    @Override
    public void physicalAttack(Hero hero) {
        int health = this.getPhysAtt() - (int)
                (this.getPhysAtt() * (hero.getPhysDef() / 100d));
        hero.diffHealth((-1) * health);
    }

}
