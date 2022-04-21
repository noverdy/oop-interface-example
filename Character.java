package interface_2;

public abstract class Character {
    private int hp;
    private int posisi_X;
    private int posisi_Y;

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPosisi_X() {
        return posisi_X;
    }

    public void setPosisi_X(int posisi_X) {
        this.posisi_X = posisi_X;
    }

    public int getPosisi_Y() {
        return posisi_Y;
    }

    public void setPosisi_Y(int posisi_Y) {
        this.posisi_Y = posisi_Y;
    }
}
