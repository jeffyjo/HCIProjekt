import javafx.application.Application;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by jeffjorgensen on 15/03/2016.
 */
public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.setName("John");
        c.setCpr(123456789);
        c.setAdress("noget");

        System.out.println(c);

        Parent p = new Parent("Hej");
        Parent p1 = new Parent("BLA");
        System.out.println(""+ p + "\n" +p1);

        //c.setParents(p1);



        //launch(args);
    }

   /* @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = new Stage();

        ListView<Child> childListView = new ListView<>();
        childListView.setCellFactory();


        BorderPane borderPane = new BorderPane();





        stage.setTitle("listView");
        stage.show();

    }*/
}
