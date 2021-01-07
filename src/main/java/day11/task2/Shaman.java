package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {


    public Shaman() {
        super(100, 20, 20, 10, 15);
    }

    @Override
    public void healHimself() {
        this.diffHealth(50);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.diffHealth(30);
    }

    @Override
    public void magicalAttack(Hero hero) {
        int health = this.getMagicAtt() - (int)
                (this.getMagicAtt() * (hero.getMagicDef() / 100d));
        hero.diffHealth((-1) * health);
    }

}
