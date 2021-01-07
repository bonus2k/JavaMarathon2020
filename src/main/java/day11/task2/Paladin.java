package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {


    public Paladin() {
        super(100, 50, 20, 15, 0);
    }

    @Override
    public void healHimself() {
        this.diffHealth(25);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.diffHealth(10);
    }

}
