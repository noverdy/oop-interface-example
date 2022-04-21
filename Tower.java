package interface_2;

public class Tower implements Attack, Heal {
    private int hp;

    public Tower() {
        this.hp = 200;
    }

    @Override
    public void hit(Character character) {
        character.setHp(character.getHp() - 20);
    }

    @Override
    public void heal(int health) {
        this.hp += health;
    }
}
