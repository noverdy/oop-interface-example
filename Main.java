package interface_2;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Assassin assassin = new Assassin();
        Enemy enemy = new Enemy();
        Tower tower = new Tower();

        tower.hit(enemy);
        assassin.hit(enemy);
        tower.hit(warrior);
        warrior.heal(20);

        System.out.println(enemy.getHp());
    }
}
