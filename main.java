import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class main extends Application {

    private String Operation = "";
    private double num1 = 0;

    private void makeButtonFill(Button btn) {
            btn.setMaxWidth(Double.MAX_VALUE);
            btn.setMaxHeight(Double.MAX_VALUE);
            btn.setStyle("-fx-background-color: #333333; -fx-text-fill: white; -fx-font-size: 14px;");
        }

    @Override
    public void start(Stage stage) {

        TextField Display = new TextField();
        Display.setEditable(false);
        Display.setStyle("-fx-font-size: 30px; -fx-allignment: center-right;");

        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btnA = new Button("A");
        Button btnB = new Button("B");
        Button btnC = new Button("C");
        Button btnD = new Button("D");
        Button btnE = new Button("E");
        Button btnF = new Button("F");
        Button btnadd = new Button("+");
        Button btnsub = new Button("-");
        Button btnprod = new Button("X");
        Button btndiv = new Button("÷");
        Button btneq = new Button("=");
        Button btncl = new Button("C");
        Button btnLsh = new Button("<<");
        Button btnRsh = new Button(">>");
        Button btnBack = new Button("⌫");
        Button btnOpen = new Button("(");
        Button btnClose = new Button(")");
        Button btnMod = new Button("%");
        Button btnSign = new Button("±");
        Button btnDot = new Button(".");

        Button[] allButtons = {
    btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
    btnA, btnB, btnC, btnD, btnE, btnF,
    btnadd, btnsub, btnprod, btndiv, btneq, btncl,
    btnLsh, btnRsh, btnBack, btnOpen, btnClose, btnMod, btnSign, btnDot
};

        for (Button b : allButtons) {
            makeButtonFill(b);
        }

        //grid pane for radix
        GridPane radixGrid = new GridPane();
        radixGrid.setHgap(20);
        radixGrid.setVgap(5);
        radixGrid.setStyle("-fx-padding: 10; -fx-font-family: 'Consolas';");

        Label lblHex = new Label("Hexadecimal: ");
        Label valHex = new Label("0");
        radixGrid.add(lblHex, 0, 0);
        radixGrid.add(valHex, 1, 0);

        Label lblOct = new Label("Octal: ");
        Label valOct = new Label("0");
        radixGrid.add(lblOct, 0, 1);
        radixGrid.add(valOct, 1, 1);

        Label lblBin = new Label("Binary: ");
        Label valBin = new Label("0");
        radixGrid.add(lblBin, 0, 2);
        radixGrid.add(valBin, 1, 2);

        Label lblDec = new Label("Decimal: ");
        Label valDec = new Label("0");
        radixGrid.add(lblDec, 0, 3);
        radixGrid.add(valDec, 1, 3);

        // grid pane for buttons
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        btnA.setOnAction(e -> {
            Display.appendText("A");
        });

        btnB.setOnAction(e -> {
            Display.appendText("B");
        });
        
        btnC.setOnAction(e -> {
            Display.appendText("C");
        });

        btnD.setOnAction(e -> {
            Display.appendText("D");
        });

        btnE.setOnAction(e -> {
            Display.appendText("E");
        });

        btnF.setOnAction(e -> {
            Display.appendText("F");
        });
        
        btnLsh.setOnAction(e -> {
            // Left shift logic to be implemented
        });
        btnRsh.setOnAction(e -> {
            // Right shift logic to be implemented
        });
        btnBack.setOnAction(e -> {
            String currentText = Display.getText();
            if (currentText.length() > 0) {
                Display.setText(currentText.substring(0, currentText.length() - 1));
            }
        });
            
        btn1.setOnAction(e -> {
            Display.appendText("1");
        });
        btn2.setOnAction(e -> {
            Display.appendText("2");
        });
        btn3.setOnAction(e -> {
            Display.appendText("3");
        });
        btn4.setOnAction(e -> {
            Display.appendText("4");
        });
        btn5.setOnAction(e -> {
            Display.appendText("5");
        });
        btn6.setOnAction(e -> {
            Display.appendText("6");
        });
        btn7.setOnAction(e -> {
            Display.appendText("7");
        });
        btn8.setOnAction(e -> {
            Display.appendText("8");
        });
        btn9.setOnAction(e -> {
            Display.appendText("9");
        });
        btn0.setOnAction(e -> {
            Display.appendText("0");
        });
        btncl.setOnAction(e -> {
            Display.clear();
        });
        btneq.setOnAction(e -> {
            // Evaluation logic to be implemented
            double num2 = Double.parseDouble(Display.getText());
            Operation op = null;

            switch (Operation) {
                case "+":
                    op = new BinaryAddition();
                    break;
                case "-":
                    op = new BinarySubtraction();
                    break;
                case "X":
                    op = new BinaryMultiplication();
                    break;
                case "÷":
                    op = new BinaryDivision();
                    break;
            }

            if (op != null) {
                double result = op.calculate(num1, num2);
                Display.setText(String.valueOf(result));
            }
        });
        btndiv.setOnAction(e -> {
            num1 = Double.parseDouble(Display.getText());
            Operation = "÷";
            Display.clear();
        });
        btnprod.setOnAction(e -> {
            num1 = Double.parseDouble(Display.getText());
            Operation = "X";
            Display.clear();
        });
        btnadd.setOnAction(e -> {
            num1 = Double.parseDouble(Display.getText());
            Operation = "+";
            Display.clear();
        });
        btnsub.setOnAction(e -> {
            num1 = Double.parseDouble(Display.getText());
            Operation = "-";
            Display.clear();
        });

        //row 0
        grid.add(btnA, 0, 0);
        grid.add(btnLsh, 1, 0);
        grid.add(btnRsh, 2, 0);
        grid.add(btncl, 3, 0);
        grid.add(btnBack, 4, 0);

        //row 1
        grid.add(btnB, 0, 1);
        grid.add(btnOpen, 1, 1);
        grid.add(btnClose, 2, 1);
        grid.add(btnMod, 3, 1);
        grid.add(btndiv, 4, 1);

        //row 2
        grid.add(btnC, 0, 2);
        grid.add(btn7, 1, 2);
        grid.add(btn8, 2, 2);
        grid.add(btn9, 3, 2);
        grid.add(btnprod, 4, 2);

        //row 3
        grid.add(btnD, 0, 3);
        grid.add(btn4, 1, 3);
        grid.add(btn5, 2, 3);
        grid.add(btn6, 3, 3);
        grid.add(btnsub, 4, 3);
        
        //row 4
        grid.add(btnE, 0, 4);
        grid.add(btn1, 1, 4);
        grid.add(btn2, 2, 4);
        grid.add(btn3, 3, 4);
        grid.add(btnadd, 4, 4);
        
        //row 5
        grid.add(btnF, 0, 5);
        grid.add(btnSign, 1, 5);
        grid.add(btn0, 2, 5);
        grid.add(btnDot, 3, 5);
        grid.add(btneq, 4, 5);
        
        for (int i = 0; i < 5; i++) {
            ColumnConstraints col = new ColumnConstraints();
            col.setHgrow(Priority.ALWAYS);
            col.setFillWidth(true);
            grid.getColumnConstraints().add(col);
            }
        for (int i = 0; i < 6; i++) {
            RowConstraints row = new RowConstraints();
            row.setVgrow(Priority.ALWAYS);
            row.setFillHeight(true);
            grid.getRowConstraints().add(row);
            }
            
        VBox root = new VBox(10);
        root.getChildren().add(Display);
        root.getChildren().add(radixGrid);
        root.getChildren().add(grid);
        root.setStyle("-fx-background-color: #202020;");

        Scene scene = new Scene(root, 320, 500);
        stage.setTitle("Programmers Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}