package main.java.com.arena;

public class Arena {

    public void startMatch(Player playerA, Player playerB) {
        Player attacker = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
        Player defender = attacker == playerA ? playerB : playerA;

        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            int attackDamage = attacker.attack();
            int defenseValue = defender.defend();
            int damage = attackDamage - defenseValue;

            if (damage > 0) {
                defender.setHealth(defender.getHealth() - damage);
            }

            System.out.println(attacker + " attacks " + defender + " causing " + damage + " damage.");
            System.out.println(defender + " has " + defender.getHealth() + " health remaining.");

            if (defender.getHealth() <= 0) {
                System.out.println(defender + " is dead. " + attacker + " wins!");
                return;
            }

            // Swap roles
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
    }
}