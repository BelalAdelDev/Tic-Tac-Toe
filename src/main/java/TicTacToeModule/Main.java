package TicTacToeModule;

import TicTacToeModule.classes.Node;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
    static boolean xTurn = true;
    static boolean pvp = false;
    static char[] board = {
            ' ',' ',' ',
            ' ',' ',' ',
            ' ',' ',' '
    };
    @Override
    public void start(Stage stage){
        MainMenuScene mainMenuScene = new MainMenuScene();
        GameScene gameScene = new GameScene();
        //printBoard(board, gameScene);
        mainMenuScene.getOnePlayerButton().setOnAction(e->{
            xTurn = true;
            pvp = false;
            stage.setScene(gameScene.getScene());
        });
        mainMenuScene.getTwoPlayersButton().setOnAction(e->{
            xTurn = false;
            pvp = true;
            stage.setScene(gameScene.getScene());
        });
        gameScene.getMainMenuButton().setOnAction(e->{
            restartGame(gameScene);
            stage.setScene(mainMenuScene.getScene());
        });
        gameScene.getPos0().setOnAction(e->{
            humanPlay(0);
            if(!pvp) computerPlay();
            printBoard(gameScene);
            checkGameOverPrompt(gameScene);
        });
        gameScene.getPos1().setOnAction(e->{
            humanPlay(1);
            if(!pvp) computerPlay();
            printBoard(gameScene);
            checkGameOverPrompt(gameScene);
        });
        gameScene.getPos2().setOnAction(e->{
            humanPlay(2);
            if(!pvp) computerPlay();
            printBoard(gameScene);
            checkGameOverPrompt(gameScene);
        });
        gameScene.getPos3().setOnAction(e->{
            humanPlay(3);
            if(!pvp) computerPlay();
            printBoard(gameScene);
            checkGameOverPrompt(gameScene);
        });
        gameScene.getPos4().setOnAction(e->{
            humanPlay(4);
            if(!pvp) computerPlay();
            printBoard(gameScene);
            checkGameOverPrompt(gameScene);
        });
        gameScene.getPos5().setOnAction(e->{
            humanPlay(5);
            if(!pvp) computerPlay();
            printBoard(gameScene);
            checkGameOverPrompt(gameScene);
        });
        gameScene.getPos6().setOnAction(e->{
            humanPlay(6);
            if(!pvp) computerPlay();
            printBoard(gameScene);
            checkGameOverPrompt(gameScene);
        });
        gameScene.getPos7().setOnAction(e->{
            humanPlay(7);
            if(!pvp) computerPlay();
            printBoard(gameScene);
            checkGameOverPrompt(gameScene);
        });
        gameScene.getPos8().setOnAction(e->{
            humanPlay(8);
            if(!pvp) computerPlay();
            printBoard(gameScene);
            checkGameOverPrompt(gameScene);
        });

        stage.setScene(mainMenuScene.getScene());
        stage.setTitle("TicTacToe");
        stage.setResizable(false);
        stage.getIcons().add(new Image("tic-tac-toe.png"));
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

    public static void humanPlay(int pos){
        if(xTurn){
            board[pos] = 'X';
        }
        else{
            board[pos] = 'O';
        }
        if (pvp) xTurn=!xTurn;
    }
    public static void computerPlay(){
        /* analyse board and play best position
            updating board
        */
        if(isBoardNotFull()) {
            Node rootNode = new Node(board, true);
            Node.buildTree(rootNode);
            int valueOfRoot = Node.miniMax(rootNode, false);
            if (!rootNode.getChildren().isEmpty()) {
                board = Node.playRound(rootNode, valueOfRoot);
            }
        }
    }

    public static void checkGameOverPrompt(GameScene gameScene){
        /* will prompt game state if done
           else it will disable played positions' buttons
        */
        int state = Node.checkGameOver(board);
        if(state == 1) {
            prompt("X won");
        } else if (state == -1) {
            prompt("O won");
        } else if (state == 0) {
            prompt("Draw");
        }
        if (state == 1 || state == -1 || state == 0) {
            restartGame(gameScene);
        }
        else{ // game is still going -> disable played positions
            if(board[0]!=' ') gameScene.getPos0().setDisable(true);
            if(board[1]!=' ') gameScene.getPos1().setDisable(true);
            if(board[2]!=' ') gameScene.getPos2().setDisable(true);
            if(board[3]!=' ') gameScene.getPos3().setDisable(true);
            if(board[4]!=' ') gameScene.getPos4().setDisable(true);
            if(board[5]!=' ') gameScene.getPos5().setDisable(true);
            if(board[6]!=' ') gameScene.getPos6().setDisable(true);
            if(board[7]!=' ') gameScene.getPos7().setDisable(true);
            if(board[8]!=' ') gameScene.getPos8().setDisable(true);
        }
    }

    public static boolean isBoardNotFull(){
        for (char c : board) {
            if (c == ' ') return true;
        }
        return false;
    }
    public static void restartGame(GameScene gameScene){
        if(pvp) xTurn=false;
        board = new char[]{
                ' ', ' ', ' ',
                ' ', ' ', ' ',
                ' ', ' ', ' '
        };
        printBoard(gameScene);
        gameScene.getPos0().setDisable(false);
        gameScene.getPos1().setDisable(false);
        gameScene.getPos2().setDisable(false);
        gameScene.getPos3().setDisable(false);
        gameScene.getPos4().setDisable(false);
        gameScene.getPos5().setDisable(false);
        gameScene.getPos6().setDisable(false);
        gameScene.getPos7().setDisable(false);
        gameScene.getPos8().setDisable(false);
    }
    public static void printBoard(GameScene gameScene){
        gameScene.getPos0().setText(board[0]+"");
        gameScene.getPos1().setText(board[1]+"");
        gameScene.getPos2().setText(board[2]+"");
        gameScene.getPos3().setText(board[3]+"");
        gameScene.getPos4().setText(board[4]+"");
        gameScene.getPos5().setText(board[5]+"");
        gameScene.getPos6().setText(board[6]+"");
        gameScene.getPos7().setText(board[7]+"");
        gameScene.getPos8().setText(board[8]+"");
    }

    public static void prompt(String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(message);
        alert.setHeaderText(message);
        alert.showAndWait();
    }

}
