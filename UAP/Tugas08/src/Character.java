//Nama: Alishza Putri Rahmadina
//NIM: 215150700111013

public abstract class Character {
    private int defense;
    private int attack;
    private int HP;

    public int getDefense() { return defense; }

    public void setDefense(int defense) { this.defense = defense; }

    public int getAttack() { return attack; }

    public void setAttack(int attack) { this.attack = attack; }

    public int getHP() { return HP; }

    public void setHP(int HP) { this.HP = HP; }

    public abstract boolean attack();

    public void receiveDamage(int damage){
        setHP(HP - (damage - getDefense()));
        if (HP <= 0){
            setHP(0);
        }
    }

    public void info(){

    }

}
