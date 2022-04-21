package interface_2;

public class Enemy extends Character implements Move, Attack {
    public Enemy() {
        this.setHp(150);
    }


    @Override
    public void hit(Character character) {
        character.setHp(character.getHp() - 30);
    }

    @Override
    public void moveUp() {
        this.setPosisi_Y(this.getPosisi_Y() + 2);
    }

    @Override
    public void moveDown() {
        this.setPosisi_Y(this.getPosisi_Y() - 2);
    }

    @Override
    public void moveLeft() {
        this.setPosisi_X(this.getPosisi_X() - 2);
    }

    @Override
    public void moveRight() {
        this.setPosisi_X(this.getPosisi_X() + 2);
    }
}
