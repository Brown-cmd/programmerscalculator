import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class main extends Application {

    @Override
    public void start(Stage stage) {
        TextField Display = new TextField();
        Display.setEditable(false);

        //grid pane for buttons
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        Button btn1 = new Button("1");
            btn1.setOnAction(e -> {
                Display.appendText("1");
            });
        Button btn2 = new Button("2");
            btn2.setOnAction(e -> {
                Display.appendText("2");
            });
        Button btn3 = new Button("3");
            btn3.setOnAction(e -> {
                Display.appendText("3");
            });
        Button btn4 = new Button("4");
            btn4.setOnAction(e -> {
                Display.appendText("4");
            });
        Button btn5 = new Button("5");
            btn5.setOnAction(e -> {
                Display.appendText("5");
            });
        Button btn6 = new Button("6");
            btn6.setOnAction(e -> {
                Display.appendText("6");
            });
        Button btn7 = new Button("7");
            btn7.setOnAction(e -> {
                Display.appendText("7");
            });
        Button btn8 = new Button("8");
            btn8.setOnAction(e -> {
                Display.appendText("8");
            });
        Button btn9 = new Button("9");
            btn9.setOnAction(e -> {
                Display.appendText("9");
            });
        Button btn0 = new Button("0");
            btn0.setOnAction(e -> {
                Display.appendText("0");
            });
        Button btncl = new Button("C");
            btn7.setOnAction(e -> {
                Display.appendText("7");
            });
        Button btneq = new Button("=");
            btn7.setOnAction(e -> {
                Display.appendText("7");
            });
        Button btndiv = new Button("/");
            btn7.setOnAction(e -> {
                Display.appendText("7");
            });
        Button btnprod = new Button("X");
            btn7.setOnAction(e -> {
                Display.appendText("7");
            });
        Button btnadd = new Button("+");
            btn7.setOnAction(e -> {
                Display.appendText("7");
            });
        Button btnsub = new Button("-");
            btn7.setOnAction(e -> {
                Display.appendText("7");
            });

        grid.add(btn7, 0, 0);
        grid.add(btn8, 1, 0);
        grid.add(btn9, 2, 0);
        grid.add(btn6, 2, 1);
        grid.add(btn5, 1, 1);
        grid.add(btn4, 0, 1);
        grid.add(btn3, 2, 2);
        grid.add(btn2, 1, 2);
        grid.add(btn1, 0, 2);
        grid.add(btn0, 1, 3);
        grid.add(btncl, 0, 3);
        grid.add(btneq, 2, 3);
        grid.add(btndiv, 3, 0);
        grid.add(btnprod, 3, 1);
        grid.add(btnadd, 3, 2);
        grid.add(btnsub, 3, 3);

        VBox root = new VBox();
        root.getChildren().add(Display);
        root.getChildren().add(grid);

        Scene scene = new Scene(root, 300, 400);
        stage.setTitle("Programmers Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}