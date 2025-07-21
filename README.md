# Tic-Tac-Toe
Simple Tic-Tac-Toe Game Made in JavaFX
 - Single Player and Two Player modes
 - Using MiniMax
 - Compatable with JVM 22 or later
### How it works
 1. initially start an empty board (array of characters: ' ')
 2. When the player picks a tile a tree of all possible moves till the end of the game is generated
 3. MiniMax Algorithm will traverse the tree giving a score for each leaf
    - If the human (X) wins: 1 score 
    - If the machine (O) wins: -1 score 
    - If draw: 0 score
 4. score is carried up the tree till the current board status
 5. the machine then selects the first child play (board) that has equal Min value
### Main Menu
<img src="https://github.com/BelalAdelDev/Tic-Tac-Toe/blob/main/Media/MainMenuScreenshot.png" alt="MainMenuScreenshot" width="500" height="500">

### In Game
<img src="https://github.com/BelalAdelDev/Tic-Tac-Toe/blob/main/Media/InGameScreenshot.png" alt="InGameScreenshot" width="500" height="500">

### Video Showcase
<img src="https://github.com/BelalAdelDev/Tic-Tac-Toe/blob/main/Media/Demo.gif" alt="Demo" width="500" height="500">

### Improvements
 - [ ] Make it Compatible with Older JVM
 - [ ] Use Alpha-Beta Pruning
 - [ ] Optimize to save tree rather then Genarating it on action
