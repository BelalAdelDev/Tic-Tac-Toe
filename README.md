# Tic-Tac-Toe JavaFX Game

A simple and elegant Tic-Tac-Toe game built with JavaFX, featuring both Single Player and Two Player modes. The game uses the MiniMax algorithm for an unbeatable AI opponent.

***

## Features

- Play against the computer (Single Player) or with a friend (Two Player mode).
- AI implemented using MiniMax algorithm for optimal moves.
- Clean and intuitive user interface with JavaFX.
- Compatible with Java Virtual Machine (JVM) version 22 or later.

***

## How It Works

1. The game starts with an empty 3x3 board (represented as an array of characters).
2. When a player picks a tile, a game tree of all possible moves until the game's end is generated.
3. The MiniMax algorithm recursively evaluates each possible game state:
   - Human (X) win scores: +1
   - Machine (O) win scores: -1
   - Draw scores: 0
4. Scores are propagated up the tree to evaluate each move's outcome.
5. The machine selects the move corresponding to the minimum score to block or win.

***

## Content

### Main Menu
<img src="https://github.com/BelalAdelDev/Tic-Tac-Toe/blob/main/Media/MainMenuScreenshot.png" alt="MainMenuScreenshot" width="500" height="500">

### In Game
<img src="https://github.com/BelalAdelDev/Tic-Tac-Toe/blob/main/Media/InGameScreenshot.png" alt="InGameScreenshot" width="500" height="500">

### Video Showcase
<img src="https://github.com/BelalAdelDev/Tic-Tac-Toe/blob/main/Media/Demo.gif" alt="Demo" width="500" height="500">


- Java 22 or later
- Maven build tool
- JavaFX libraries (included in Maven dependencies)

***

## Building and Running

Clone the repository and run the following commands:

```bash
mvn clean javafx:run
```

This will compile and launch the application.

***

## Planned Improvements

- Add compatibility with older JVM versions.
- Implement Alpha-Beta pruning to optimize MiniMax.
- Optimize AI by saving the game tree instead of regenerating it every move.

***

## Credits

Developed by Belal Adel © 2024-2025
