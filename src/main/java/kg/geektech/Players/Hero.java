package kg.geektech.Players;

public abstract class Hero extends GameEntity implements havingSP{
  private SuperAbility ability;

    public void attack(Boss boss){
       if (boss.getHp()> 0){
        boss.setHp(boss.getHp()- this.getDamage());}
    };
    public Hero(int hp, int damage,SuperAbility ability, String name) {
        super(hp, damage, name);
        this.ability = ability;
    }

    public SuperAbility getAbility() {
        return ability;
    }
}
