package interface_2;

public class Warrior extends Character implements Move, Attack, Heal {
    public Warrior() {
        this.setHp(150);
    }

    @Override
    public void hit(Character character) {
        character.setHp(character.getHp() - 40);
    }

    @Override
    public void moveUp() {
        this.setPosisi_Y(this.getPosisi_Y() + 4);
    }

    @Override
    public void moveDown() {
        this.setPosisi_Y(this.getPosisi_Y() - 4);
    }

    @Override
    public void moveLeft() {
        this.setPosisi_X(this.getPosisi_X() - 4);
    }

    @Override
    public void moveRight() {
        this.setPosisi_X(this.getPosisi_X() + 4);
    }

    @Override
    public void heal(int health) {
        this.setHp(this.getHp() + health);
    }
}
