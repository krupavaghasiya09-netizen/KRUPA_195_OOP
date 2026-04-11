import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class GradeBarChart extends Application {

    @Override
    public void start(Stage stage) {

        Rectangle projects = new Rectangle(60, 20 * 3); 
        projects.setFill(Color.RED);

        Rectangle quizzes = new Rectangle(60, 10 * 3);
        quizzes.setFill(Color.BLUE);

        Rectangle midterm = new Rectangle(60, 30 * 3);
        midterm.setFill(Color.GREEN);

        Rectangle finalExam = new Rectangle(60, 40 * 3);
        finalExam.setFill(Color.ORANGE);

    
        Text pText = new Text("Projects — 20%");
        Text qText = new Text("Quizzes — 10%");
        Text mText = new Text("Midterm — 30%");
        Text fText = new Text("Final — 40%");


        VBox box1 = new VBox(5, projects, pText);
        VBox box2 = new VBox(5, quizzes, qText);
        VBox box3 = new VBox(5, midterm, mText);
        VBox box4 = new VBox(5, finalExam, fText);

    
        box1.setAlignment(Pos.BOTTOM_CENTER);
        box2.setAlignment(Pos.BOTTOM_CENTER);
        box3.setAlignment(Pos.BOTTOM_CENTER);
        box4.setAlignment(Pos.BOTTOM_CENTER);

        
        HBox root = new HBox(20, box1, box2, box3, box4);
        root.setAlignment(Pos.BOTTOM_CENTER);

        Scene scene = new Scene(root, 500, 300);

        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
