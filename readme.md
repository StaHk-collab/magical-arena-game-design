# Magical Arena

## Overview
This is a simple simulation of a magical arena where two players fight until one dies. Each player has attributes for health, strength, and attack. The players take turns attacking each other, with the game ending when one player's health reaches 0.

## How to Run

1. **Clone the repository:**
    ```sh
    git clone <repository-url>
    ```
2. **Navigate to the project directory:**
    ```sh
    cd magical-arena
    ```
3. **Compile the code:**
    ```sh
    javac -d out src/main/java/com/arena/*.java
    ```
4. **Run the simulation:**
    ```sh
    java -cp out com.arena.Main
    ```
5. **Run the tests:**
    ```sh
    javac -d out -cp .:junit-4.13.2.jar src/test/java/com/arena/*.java
    java -cp .:out:junit-4.13.2.jar org.junit.runner.JUnitCore com.arena.PlayerTest com.arena.ArenaTest
    ```

## Project Structure

```plaintext
magical-arena/
├──lib/
| ├── hamcrest-core-1.3.jar
| ├── junit-4.13.2.jar
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── arena/
│ │ │ ├── Main.java
│ │ │ ├── Player.java
│ │ │ └── Arena.java
│ └── test/
│ └── java/
│ └── com/
│ └── arena/
│ ├── ArenaTest.java
│ └── PlayerTest.java
└── README.md
```

## Simulation Example (Run the main method in Main class)

```plaintext
Details for PlayerA
Enter the initial health value of PlayerA :
50
Enter the initial strength value of PlayerA :
5
Enter the initial attack value of PlayerA :
10
Details for PlayerB
Enter the initial health value of PlayerB :
100
Enter the initial strength value of PlayerB :
10
Enter the initial attack value of PlayerB :
5
Player {health=50, strength=5, attack=10} attacks Player {health=100, strength=10, attack=5} causing -20 damage.
Player {health=100, strength=10, attack=5} has 100 health remaining.
Player {health=100, strength=10, attack=5} attacks Player {health=45, strength=5, attack=10} causing 5 damage.    
Player {health=45, strength=5, attack=10} has 45 health remaining.
Player {health=45, strength=5, attack=10} attacks Player {health=80, strength=10, attack=5} causing 20 damage.    
Player {health=80, strength=10, attack=5} has 80 health remaining.
Player {health=80, strength=10, attack=5} attacks Player {health=45, strength=5, attack=10} causing -10 damage.   
Player {health=45, strength=5, attack=10} has 45 health remaining.
Player {health=45, strength=5, attack=10} attacks Player {health=80, strength=10, attack=5} causing 0 damage.     
Player {health=80, strength=10, attack=5} has 80 health remaining.
Player {health=80, strength=10, attack=5} attacks Player {health=45, strength=5, attack=10} causing -10 damage.   
Player {health=45, strength=5, attack=10} has 45 health remaining.
Player {health=45, strength=5, attack=10} attacks Player {health=80, strength=10, attack=5} causing -20 damage.   
Player {health=80, strength=10, attack=5} has 80 health remaining.
Player {health=80, strength=10, attack=5} attacks Player {health=30, strength=5, attack=10} causing 15 damage.    
Player {health=30, strength=5, attack=10} has 30 health remaining.
Player {health=30, strength=5, attack=10} attacks Player {health=70, strength=10, attack=5} causing 10 damage.    
Player {health=70, strength=10, attack=5} has 70 health remaining.
Player {health=70, strength=10, attack=5} attacks Player {health=20, strength=5, attack=10} causing 10 damage.    
Player {health=20, strength=5, attack=10} has 20 health remaining.
Player {health=20, strength=5, attack=10} attacks Player {health=70, strength=10, attack=5} causing -40 damage.   
Player {health=70, strength=10, attack=5} has 70 health remaining.
Player {health=70, strength=10, attack=5} attacks Player {health=5, strength=5, attack=10} causing 15 damage.     
Player {health=5, strength=5, attack=10} has 5 health remaining.
Player {health=5, strength=5, attack=10} attacks Player {health=70, strength=10, attack=5} causing -10 damage.    
Player {health=70, strength=10, attack=5} has 70 health remaining.
Player {health=70, strength=10, attack=5} attacks Player {health=-20, strength=5, attack=10} causing 25 damage.   
Player {health=-20, strength=5, attack=10} has -20 health remaining.
Player {health=-20, strength=5, attack=10} is dead. Player {health=70, strength=10, attack=5} wins!
PlayerA wins !

```