package main.java.com.arena;

public class Player {
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public int attack() {
        return attack * rollDice();
    }

    public int defend() {
        return strength * rollDice();
    }

    @Override
    public String toString() {
        return "Player {" +
                "health=" + health +
                ", strength=" + strength +
                ", attack=" + attack +
                '}';
    }
}
