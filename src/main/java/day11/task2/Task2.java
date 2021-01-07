package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Paladin paladin = new Paladin();
        Shaman shaman = new Shaman();
        Magician magician = new Magician();
        Warrior warrior = new Warrior();

        warrior.physicalAttack(paladin);
        System.out.println(paladin);
        paladin.physicalAttack(magician);
        System.out.println(magician);
        shaman.healTeammate(magician);
        System.out.println(magician);
        magician.magicalAttack(paladin);
        System.out.println(paladin);
        shaman.physicalAttack(warrior);
        System.out.println(warrior);
        paladin.healHimself();
        System.out.println(paladin);
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
    }
}
