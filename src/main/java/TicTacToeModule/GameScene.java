package TicTacToeModule;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class GameScene {
    Scene scene;
    Button pos0,pos1,pos2,pos3,pos4,pos5,pos6,pos7,pos8;
    Rectangle linesRectangle,backGroundRectangle;
    GridPane gridPane;
    Button mainMenuButton;
    Text gameModeTitle;

    StackPane stackPane;
    public GameScene(){
        init();
        builder();
        style();
    }
    public void init(){
        pos0 = new Button();
        pos1 = new Button();
        pos2 = new Button();
        pos3 = new Button();
        pos4 = new Button();
        pos5 = new Button();
        pos6 = new Button();
        pos7 = new Button();
        pos8 = new Button();
        mainMenuButton = new Button("Main Menu");
        gameModeTitle = new Text();
        gridPane = new GridPane();
        linesRectangle = new Rectangle();
        backGroundRectangle = new Rectangle();
        stackPane = new StackPane();
        scene = new Scene(stackPane,900,950);
        scene.getStylesheets().add("style.css");
    }

    public void builder(){
        linesRectangle.setHeight(825);
        linesRectangle.setWidth(825);
        linesRectangle.setFill(Color.WHITE);

        backGroundRectangle.setHeight(950);
        backGroundRectangle.setWidth(900);
        backGroundRectangle.setFill(Color.BLACK);

        double cornerButtonWidth=260d;
        double cornerButtonHeight=260d;
        double upDownButtonWidth=295d;
        double upDownButtonHeight=260d;
        double leftRightButtonWidth=260d;
        double leftRightButtonHeight=295d;

        pos0.setMinWidth(cornerButtonWidth);
        pos0.setMinHeight(cornerButtonHeight);
        pos1.setMinWidth(upDownButtonWidth);
        pos1.setMinHeight(upDownButtonHeight);
        pos2.setMinWidth(cornerButtonWidth);
        pos2.setMinHeight(cornerButtonHeight);
        pos3.setMinWidth(leftRightButtonWidth);
        pos3.setMinHeight(leftRightButtonHeight);
        pos4.setMinWidth(295);
        pos4.setMinHeight(295);
        pos5.setMinWidth(leftRightButtonWidth);
        pos5.setMinHeight(leftRightButtonHeight);
        pos6.setMinWidth(cornerButtonWidth);
        pos6.setMinHeight(cornerButtonHeight);
        pos7.setMinWidth(upDownButtonWidth);
        pos7.setMinHeight(upDownButtonHeight);
        pos8.setMinWidth(cornerButtonWidth);
        pos8.setMinHeight(cornerButtonHeight);

        pos0.setTextFill(Color.WHITE);
        pos1.setTextFill(Color.WHITE);
        pos2.setTextFill(Color.WHITE);
        pos3.setTextFill(Color.WHITE);
        pos4.setTextFill(Color.WHITE);
        pos5.setTextFill(Color.WHITE);
        pos6.setTextFill(Color.WHITE);
        pos7.setTextFill(Color.WHITE);
        pos8.setTextFill(Color.WHITE);

        gridPane.add(pos0,0,0);
        gridPane.add(pos1,1,0);
        gridPane.add(pos2,2,0);
        gridPane.add(pos3,0,1);
        gridPane.add(pos4,1,1);
        gridPane.add(pos5,2,1);
        gridPane.add(pos6,0,2);
        gridPane.add(pos7,1,2);
        gridPane.add(pos8,2,2);
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER);

        stackPane.getChildren().addAll(backGroundRectangle,linesRectangle,gridPane,mainMenuButton);
        linesRectangle.setTranslateY(40);
        mainMenuButton.setTranslateY(-420);
        mainMenuButton.setTranslateX(332);
        gridPane.setTranslateY(40);
        scene.setFill(Color.BLACK);
    }

    public void style(){
        pos0.getStyleClass().add("button");
        pos1.getStyleClass().add("button");
        pos2.getStyleClass().add("button");
        pos3.getStyleClass().add("button");
        pos4.getStyleClass().add("button");
        pos5.getStyleClass().add("button");
        pos6.getStyleClass().add("button");
        pos7.getStyleClass().add("button");
        pos8.getStyleClass().add("button");
        mainMenuButton.getStyleClass().add("menuButton");
        mainMenuButton.setStyle("-fx-font-size: 30px;");
    }

    public Button getMainMenuButton() {
        return mainMenuButton;
    }
    public Scene getScene(){
        return scene;
    }
    public Button getPos0() {
        return pos0;
    }
    public Button getPos1() {
        return pos1;
    }
    public Button getPos2() {
        return pos2;
    }
    public Button getPos3() {
        return pos3;
    }
    public Button getPos4() {
        return pos4;
    }
    public Button getPos5() {
        return pos5;
    }
    public Button getPos6() {
        return pos6;
    }
    public Button getPos7() {
        return pos7;
    }
    public Button getPos8() {
        return pos8;
    }
}
