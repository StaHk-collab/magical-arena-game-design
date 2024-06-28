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