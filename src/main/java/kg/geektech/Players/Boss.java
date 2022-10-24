package kg.geektech.Players;

import kg.geektech.General.Logic;

public class Boss extends GameEntity {
    private SuperAbility defence;
    public Boss(int hp, int damage, String name) {
        super(hp, damage, name);
    }
    public void chooseDefence(Hero[] heroes){
        int randomIndex = Logic.random.nextInt(heroes.length);
        this.defence = heroes[randomIndex].getAbility();
    };
    public void attack(Hero[] heroes){
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHp() > 0){
            heroes[i].setHp(heroes[i].getHp()-this.getDamage());}
        }
    };
    public SuperAbility getDefence() {
        return defence;
    }

    @Override
    public String toString() {
        return super.toString() + " Defence: " + " " + (this.getDefence() == null ? "No defence" : this.getDefence());
    }
}

