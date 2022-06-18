//Nama: Alishza Putri Rahmadina
//NIM: 215150700111013

public class Magician extends Character{

    public Magician() {
        setHP(100);
        setAttack(60);
        setDefense(10);
    }

    @Override
    public boolean attack() {
        int chance = (int) (Math.random() * 10);
        if (chance > 0 && chance <= 35){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void info() {
        System.out.printf("%-20s: %d%n", "HP", getHP() );
        System.out.printf("%-20s: %d%n", "Attack", getAttack() );
        System.out.printf("%-20s: %d%n", "Defense", getDefense() );
    }
}
