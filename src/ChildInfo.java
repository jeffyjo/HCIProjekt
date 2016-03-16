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
import javafx.util.converter.IntegerStringConverter;

import java.security.SecurityPermission;

/**
 * Created by jeffjorgensen on 16/03/2016.
 */
public class ChildInfo {

    public void start(Stage primaryStage, Child child) {

        GridPane gridPane = new GridPane();

        //Labels
        Label label = new Label("Navn");
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
        TextField textField = new TextField();
        textField.setText(child.getName());

        TextField textField2 = new TextField();
        textField2.setText(child.getAdress());
        child.setAdress(textField2.getText());

        TextField textField3 = new TextField();
        textField3.setText(child.getByOgPostnummer());

        TextField textField4 = new TextField();
        Integer i = child.getCpr();
        textField4.setText(i.toString());

        TextField textField5 = new TextField();
        textField5.setText(child.getHomePhone());

        TextField textField6 = new TextField();
        textField6.setText(child.getParent1());

        TextField textField7 = new TextField();
        textField7.setText(child.getParent1Cell());

        TextField textField8 = new TextField();
        textField8.setText(child.getParent1WorkPhone());

        TextField textField9 = new TextField();
        textField9.setText(child.getParent2());

        TextField textField10 = new TextField();
        textField10.setText(child.getParent2Cell());

        TextField textField11 = new TextField();
        textField11.setText(child.getParent2WorkPhone());

        TextField textField12 = new TextField();
        textField12.setText(child.getContactPerson());

        TextField textField13 = new TextField();
        textField13.setText(child.getCellPhone());

        TextField textField14 = new TextField();
        textField14.setText(child.getStartDate());

        TextField textField15 = new TextField();
        textField15.setText(child.getNote());

        TextField textField16 = new TextField();

        TextField textField17 = new TextField();

        //Buttons
        Button backButton = new Button("Tilbage");
        Button gemButton = new Button("Gem");

        HBox hBox = new HBox();
        hBox.getChildren().addAll(backButton, gemButton);
        hBox.setSpacing(20);
        hBox.setPadding(new Insets(20, 20, 20, 20));

        //gridpane Allignment
        gridPane.setHalignment(label, HPos.RIGHT);
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
        gridPane.add(label, 0, 0);
        gridPane.add(textField, 1, 0);
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

        backButton.setOnAction(e -> visAlle.start(primaryStage));
        gemButton.setOnMouseClicked(e ->
                visAlle.start(primaryStage));

        Scene scene = new Scene(gridPane, 500, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void setTextField(TextField textField){
        String s = textField.getText();

        if (textField.equals(null)) {
            textField.setPromptText("indtast oplysninger");
        } else textField.setText(s);
    }
}