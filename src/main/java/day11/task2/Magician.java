package day11.task2;

public class Magician extends Hero implements MagicAttack {

    public Magician() {
        super(100, 0, 80, 5, 20);
    }

    @Override
    public void magicalAttack(Hero hero) {
        int health = this.getMagicAtt() - (int)
                (this.getMagicAtt() * (hero.getMagicDef() / 100d));
        hero.diffHealth((-1) * health);
    }

}
