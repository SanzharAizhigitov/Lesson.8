package kg.geektech.Players;

import kg.geektech.General.Logic;

public class Warrior extends Hero{

    public Warrior(int hp, int damage, String name) {
        super(hp, damage, SuperAbility.CRITCAL_DAMAGE, name);
    }

    @Override
    public void applySP(Hero[] heroes, Boss boss) {
        int coeficient = Logic.random.nextInt(5) + 1;
boss.setHp(boss.getHp() - coeficient*this.getDamage());
        System.out.println("Warrior Crit: " + (coeficient*this.getDamage() + this.getDamage()));
    }
}
