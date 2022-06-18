//Nama: Alishza Putri Rahmadina
//NIM: 215150700111013

public class Healer extends Character {

    public Healer() {
        setHP(70);
        setAttack(60);
        setDefense(10);
    }

    public void heal(){
        setHP(getHP()+25);

    }

    @Override
    public boolean attack() {
        int chance = (int) (Math.random() * 10);
        if (chance > 0 && chance <= 85){
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
