package kg.geektech.Players;

public abstract class GameEntity {
    private int hp;
    private String name;

    public GameEntity(int hp, int damage, String name) {
        this.hp = hp;
        this.damage = damage;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp<0){this.hp=0;} else {
        this.hp = hp;}
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    private int damage;

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() +this.getName() + "Heal: " + this.getHp()+ " " + "Damage: " + this.getDamage();
    }
}
