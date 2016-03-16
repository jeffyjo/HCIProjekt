import com.sun.org.glassfish.external.arc.Taxonomy;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.security.SecurityPermission;


public class Indskrivning {

    public void start(Stage primaryStage) {

        GridPane gridPane = new GridPane();

        //Labels
        Label label1 = new Label("Navn");
        Label label2 = new Label("Adresse/husnr.");
        Label label3 = new Label("By/postnr.");
        Label label4 = new Label("CPR");
        Label label5 = new Label("Hjemme tlf.");
        Label label6 = new Label("Forældre 1");
        Label label7 = new Label("Mobil tlf");
        Label label8 = new Label("Arbejds tlf");
        Label label9 = new Label("Forældre 2");
        Label label10 = new Label("Mobil tlf");
        Label label11 = new Label("Arbejds tlf");
        Label label12 = new Label("Kontaktperson");
        Label label13 = new Label("Mobil tlf");
        Label label14 = new Label("Startdato");
        Label label15 = new Label("Note");

        //TextFields
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        TextField textField5 = new TextField();
        TextField textField6 = new TextField();
        TextField textField7 = new TextField();
        TextField textField8 = new TextField();
        TextField textField9 = new TextField();
        TextField textField10 = new TextField();
        TextField textField11 = new TextField();
        TextField textField12 = new TextField();
        TextField textField13 = new TextField();
        TextField textField14 = new TextField();
        TextField textField15 = new TextField();
        TextField textField16 = new TextField();
        TextField textField17 = new TextField();


        //Buttons
        Button backButton = new Button("Annuller");
        Button gemButton = new Button("Gem");

        HBox hBox = new HBox();
        hBox.getChildren().addAll(backButton, gemButton);
        hBox.setSpacing(20);
        hBox.setPadding(new Insets(20, 20, 20, 20));

        //gridpane Allignment
        gridPane.setHalignment(label1, HPos.RIGHT);
        gridPane.setHalignment(label2, HPos.RIGHT);
        gridPane.setHalignment(label3, HPos.RIGHT);
        gridPane.setHalignment(label4, HPos.RIGHT);
        gridPane.setHalignment(label5, HPos.RIGHT);
        gridPane.setHalignment(label6, HPos.RIGHT);
        gridPane.setHalignment(label7, HPos.RIGHT);
        gridPane.setHalignment(label8, HPos.RIGHT);
        gridPane.setHalignment(label9, HPos.RIGHT);
        gridPane.setHalignment(label10, HPos.RIGHT);
        gridPane.setHalignment(label11, HPos.RIGHT);
        gridPane.setHalignment(label12, HPos.RIGHT);
        gridPane.setHalignment(label13, HPos.RIGHT);
        gridPane.setHalignment(label14, HPos.RIGHT);
        gridPane.setHalignment(label15, HPos.RIGHT);
        gridPane.setHalignment(backButton, HPos.LEFT);
        gridPane.setHalignment(hBox, HPos.RIGHT);

        //gridpane position
        gridPane.add(label1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(label2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(label3, 0, 2);
        gridPane.add(textField3, 1, 2);
        gridPane.add(label4, 0, 3);
        gridPane.add(textField4, 1, 3);
        gridPane.add(label5, 0, 4);
        gridPane.add(textField5, 1, 4);
        gridPane.add(label6, 0, 5);
        gridPane.add(textField6, 1, 5);
        gridPane.add(label7, 0, 6);
        gridPane.add(textField7, 1, 6);
        gridPane.add(label8, 0, 7);
        gridPane.add(textField8, 1, 7);
        gridPane.add(label9, 0, 8);
        gridPane.add(textField9, 1, 8);
        gridPane.add(label10, 0, 9);
        gridPane.add(textField10, 1, 9);
        gridPane.add(label11, 0, 10);
        gridPane.add(textField11, 1, 10);
        gridPane.add(label12, 0, 11);
        gridPane.add(textField12, 1, 11);
        gridPane.add(label13, 0, 12);
        gridPane.add(textField13, 1, 12);
        gridPane.add(label14, 0, 13);
        gridPane.add(textField14, 1, 13);
        gridPane.add(label15, 0, 14);
        gridPane.add(textField15, 1, 14);
        gridPane.add(hBox, 2, 15);

        gridPane.setPadding(new Insets(20, 0, 20, 20));
        gridPane.setHgap(7);
        gridPane.setVgap(7);

        //Buttons Action
        MainMenu mainMenu = new MainMenu();
        VisAlle visAlle = new VisAlle();

        backButton.setOnAction(e -> mainMenu.start(primaryStage));
        gemButton.setOnAction(e -> visAlle.start(primaryStage));
        gemButton.setOnMouseClicked(event -> {
            visAlle.start(primaryStage);
        });

        Scene scene = new Scene(gridPane, 500, 800);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void gemButtonClicked(){
        Child child = new Child();

        child.setName("Joe");
    }

    public Child makeChild(TextField textField){
        Child child = new Child();
        String s = textField.getText();

        child.setName(s);

        return child;
    }
}