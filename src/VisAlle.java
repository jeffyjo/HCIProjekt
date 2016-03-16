import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

/**
 * Created by jeffjorgensen on 16/03/2016.
 */
public class VisAlle {

    public void start(Stage primaryStage){

        ObservableList<Child> childObservableList = FXCollections.observableArrayList(
                new Child("John", 1234567890),
                new Child("Rune", 987654321),
                new Child("Maria", 1111111111),
                new Child("Rudolf", "Gaden", "1234 BYBY", 1234565432, "Hjemnr.", "Far Finn", "Finn mob", "Finn arbjtlf",
                        "Mor Jonna", "Jonna mob", "Jonna jobnr.", "KontaktKarsten", "KarstenKontaktnr.", "Starter Her", "Note: er fedt!")
        );

        TableView<Child> childTableView = new TableView<>();
        childTableView.itemsProperty().setValue(childObservableList);

        TableColumn<Child, String> name = new TableColumn<>("Navn");
        name.setMinWidth(200);
        TableColumn<Child, Integer> cpr = new TableColumn<>("Cpr");
        TableColumn<Child, String> adress = new TableColumn<>("Adresse");

        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        cpr.setCellValueFactory(new PropertyValueFactory<>("Cpr"));
        adress.setCellValueFactory(new PropertyValueFactory<>("adress"));

        childTableView.getColumns().addAll(name, cpr, adress);

        //Buttons
        Button backButton = new Button("Tilbage");
        Button showButton = new Button("Vis");

        HBox hBox = new HBox();
        hBox.getChildren().addAll(backButton, showButton);

        //Button-action
        MainMenu mainMenu = new MainMenu();
        ChildInfo childInfo = new ChildInfo();

        backButton.setOnAction(e -> mainMenu.start(primaryStage));
        showButton.setOnAction(e -> {
            int i = childObservableList.indexOf(childTableView.getSelectionModel().getSelectedItem());
            Child c = childObservableList.get(i);
            childInfo.start(primaryStage, c);

        });

        childTableView.setRowFactory(tv -> {
            TableRow<Child> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if(event.getClickCount() == 2 && (!row.isEmpty())){
                    int i = childObservableList.indexOf(childTableView.getSelectionModel().getSelectedItem());
                    Child c = childObservableList.get(i);
                    childInfo.start(primaryStage, c);
                }
            });
            return row;
        });

        //Pane
        VBox vBox = new VBox();
        vBox.getChildren().addAll(childTableView, hBox);

        Scene scene = new Scene(vBox, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}