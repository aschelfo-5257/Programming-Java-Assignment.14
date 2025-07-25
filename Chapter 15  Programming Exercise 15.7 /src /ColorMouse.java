import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ColorMouse extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Circle circle = new Circle(100, 100, 50); // Center at (x, y), and radius
        circle.setFill(Color.BLUE); // Initial fill color
        circle.setStroke(Color.RED); // Border color

        // Change color to red on mouse press
        circle.setOnMousePressed(e -> circle.setFill(Color.RED));

        // Change color back to blue on mouse release
        circle.setOnMouseReleased(e -> circle.setFill(Color.BLUE));

        pane.getChildren().add(circle); // Correct variable name

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Mouse Color Change");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
