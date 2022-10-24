package kg.geektech.Players;

public class Medic extends Hero {
    private int healPoints;
    public Medic(int hp, int damage, int healPoints, String name) {
        super(hp, damage, SuperAbility.HEAL, name);
    this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    @Override
    public void applySP(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHp()>0&& this != heroes[i]){
                heroes[i].setHp(heroes[i].getHp() + this.getHealPoints());
            }

        }
    }
}
