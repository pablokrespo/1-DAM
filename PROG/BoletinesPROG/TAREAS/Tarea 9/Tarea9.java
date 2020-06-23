package tarea9;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Tarea9 extends Application {
    public void start(Stage primaryStage) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("Main.fxml"));
        primaryStage.setTitle("Tarea9");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
