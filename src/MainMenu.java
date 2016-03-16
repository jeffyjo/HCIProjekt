import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainMenu extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        // Label
        Label menuLabel = new Label("Menu");
        Label welcomeLabel = new Label("Velkommen medarbejder 1");
        // Button
        Button logoutButton = new Button("Log ud");
        Button indskrivningButton = new Button("Indskrivning");
        Button visBørnButton = new Button("Vis alle børn");
        // Borderpanes
        BorderPane borderPane = new BorderPane();
        // Gridpane
        GridPane gridPane = new GridPane();

        Label label = new Label("Hej");
        gridPane.getChildren().addAll(label);
        borderPane.setPadding(new Insets(10, 10, 10, 0));
        borderPane.setRight(logoutButton);
        HBox hBox = new HBox(8);

        VBox vBox1 = new VBox(8);
        vBox1.getChildren().addAll(menuLabel, welcomeLabel);
        vBox1.setAlignment(Pos.TOP_CENTER);
        borderPane.setTop(vBox1);
        hBox.getChildren().addAll(indskrivningButton, visBørnButton);
        hBox.setAlignment(Pos.CENTER);
        borderPane.setCenter(hBox);

        // Scenes
        Scene menuScene = new Scene(borderPane, 500, 500);
        Indskrivning indskrivning = new Indskrivning();
        VisAlle visAlle = new VisAlle();

        indskrivningButton.setOnAction(e -> indskrivning.start(primaryStage));
        visBørnButton.setOnAction(e -> visAlle.start(primaryStage));
        primaryStage.setScene(menuScene);
        primaryStage.setTitle("Roskilde Frie Børnehave");
        primaryStage.show();
    }
}
