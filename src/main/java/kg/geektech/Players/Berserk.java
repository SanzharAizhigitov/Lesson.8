package kg.geektech.Players;

import kg.geektech.General.Logic;

public class Berserk extends Hero {
    private int savedDamage;
    public Berserk(int hp, int damage, String name) {
        super(hp, damage, SuperAbility.MIRROR, name);
    }
private static int precent;
    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }

    @Override
    public void applySP(Hero[] heroes, Boss boss) {
precent = boss.getDamage()/5; //20%
boss.setHp(boss.getHp()  - precent);
        System.out.println("Berserk mirror damage: " +(this.getDamage()+precent) );
    }
}
