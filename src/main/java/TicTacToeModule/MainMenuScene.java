package TicTacToeModule;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class MainMenuScene {
    Text tic_Tac_Toe_title;
    ImageView logo;
    Button twoPlayersButton;
    Button onePlayerButton;
    Label madeBy,copyRights;
    GridPane gridPane;
    Rectangle backGroundRectangle;
    StackPane stackPane;
    Scene scene;
    public MainMenuScene(){
        init();
        builder();
        style();
    }
    public void init(){
        tic_Tac_Toe_title = new Text("Tic-Tac-Toe");
        logo = new ImageView("tic-tac-toeReversed.png");
        twoPlayersButton = new Button("2 Players");
        onePlayerButton = new Button("1 Player");
        madeBy = new Label("Made by Belal Adel");
        copyRights = new Label("Copyright (c) 2024-2025");
        gridPane = new GridPane();
        backGroundRectangle = new Rectangle();
        stackPane = new StackPane();
        scene = new Scene(stackPane,900,950);
        scene.getStylesheets().add("style.css");
    }
    public void builder(){
        twoPlayersButton.setMinWidth(260);
        onePlayerButton.setTranslateX(11);
        onePlayerButton.setMinWidth(260);
        logo.minWidth(520);
        logo.setTranslateX(45);
        backGroundRectangle.setHeight(950);
        backGroundRectangle.setWidth(900);
        backGroundRectangle.setFill(Color.BLACK);
        madeBy.setTranslateY(40); // 55
        madeBy.setTranslateX(-138);
        copyRights.setTranslateY(40); // 55
        copyRights.setTranslateX(138);
        tic_Tac_Toe_title.setTranslateX(48);

        gridPane.add(tic_Tac_Toe_title,0,0,4,1);
        gridPane.add(logo,0,1,4,1);
        gridPane.add(twoPlayersButton,0,2,2,1);
        gridPane.add(onePlayerButton,2,2,2,1);
        gridPane.add(madeBy,0,3);
        gridPane.add(copyRights,3,3);
        gridPane.setVgap(50);
        gridPane.setHgap(50);
        gridPane.setAlignment(Pos.CENTER);

        stackPane.getChildren().addAll(backGroundRectangle,gridPane);
    }
    public void style(){
        tic_Tac_Toe_title.getStyleClass().add("title");
        twoPlayersButton.getStyleClass().add("menuButton");
        onePlayerButton.getStyleClass().add("menuButton");
        madeBy.getStyleClass().add("label");
        copyRights.getStyleClass().add("label");
    }

    public Scene getScene(){
        return scene;
    }

    public Button getTwoPlayersButton() {
        return twoPlayersButton;
    }

    public Button getOnePlayerButton() {
        return onePlayerButton;
    }
}
