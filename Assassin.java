package interface_2;

public class Assassin extends Character implements Move, Attack {
    public Assassin() {
        this.setHp(100);
    }

    @Override
    public void hit(Character character) {
        character.setHp(character.getHp() - 60);
    }

    @Override
    public void moveUp() {
        this.setPosisi_Y(this.getPosisi_Y() + 7);
    }

    @Override
    public void moveDown() {
        this.setPosisi_Y(this.getPosisi_Y() - 7);
    }

    @Override
    public void moveLeft() {
        this.setPosisi_X(this.getPosisi_X() - 7);
    }

    @Override
    public void moveRight() {
        this.setPosisi_X(this.getPosisi_X() + 7);
    }
}
