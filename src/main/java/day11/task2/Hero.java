package day11.task2;

public abstract class Hero implements PhysAttack{
    public final Integer MAX_HEALTH = 100;
    public final Integer MIN_HEALTH = 0;
    private Integer health;     //(здоровье)
    private Integer physDef;    //(процент поглощения физического урона)
    private Integer magicDef;   // (процент поглощения магического урона)
    private Integer physAtt;    //(величина физической атаки), по необходимости
    private Integer magicAtt;   // (величина магической атаки), по необходимости


    public Hero(Integer health, Integer physDef, Integer magicDef, Integer physAtt, Integer magicAtt) {
        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
        this.magicAtt = magicAtt;
    }

    public void diffHealth(Integer health) {
        this.health += health;
        this.health = (this.health < MIN_HEALTH) ? MIN_HEALTH : this.health;
        this.health = (this.health > MAX_HEALTH) ? MAX_HEALTH : this.health;

    }

    public Integer getPhysDef() {
        return physDef;
    }

    public Integer getMagicDef() {
        return magicDef;
    }

    public Integer getPhysAtt() {
        return physAtt;
    }

    public Integer getMagicAtt() {
        return magicAtt;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int health = this.getPhysAtt() - (int)
                (this.getPhysAtt() * (hero.getPhysDef() / 100d));
        hero.diffHealth((-1) * health);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "health=" + health +
                '}';
    }
}
