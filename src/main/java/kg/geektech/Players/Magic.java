package kg.geektech.Players;

public class Magic extends Hero {

    public Magic(int hp, int damage, String name) {
        super(hp, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySP(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage()+5);
        }
    }
}
