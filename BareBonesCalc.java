/*
 * Lab 16 - Write a program to perform addition, subtraction, multiplication, 
 * and division, as shown in Figure 15.27a.
 * 
 */


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Lab16 extends Application {
	double numOne;
	double numTwo;
	double solution;
	
	@Override
	public void start(Stage mainScene) throws Exception {
		
		
		// Text input
		TextField inputA = new TextField();
		inputA.setPrefWidth(50);
		TextField inputB = new TextField();
		inputB.setPrefWidth(50);
		TextField output = new TextField();
		output.setPrefWidth(75);
		
		Label labelA = new Label("Number A:");
		Label labelB = new Label("Number B:");
		Label labelC = new Label("Answer:");
		
		HBox inputLine = new HBox(8);
		inputLine.getChildren().addAll(labelA, inputA, labelB, inputB, labelC, output);
		inputLine.setLayoutX(20);
		inputLine.setLayoutY(50);
		
		// Buttons
		Button addBtn = new Button("Add");
		Button subtractBtn = new Button("Subtract");
		Button multiplyBtn = new Button("Multiply");
		Button divideBtn = new Button("Divide");
		
		// Button interactions
		
		addBtn.setOnAction(e ->{ // Addition
			solution = Double.parseDouble(inputA.getText()) + Double.parseDouble(inputB.getText());
			output.setText(solution + "");
		});
		
		subtractBtn.setOnAction(e ->{ // Subtraction
			solution = Double.parseDouble(inputA.getText()) - Double.parseDouble(inputB.getText());
			output.setText(solution + "");
		});
		
		multiplyBtn.setOnAction(e ->{ // Multiplication
			solution = Double.parseDouble(inputA.getText()) * Double.parseDouble(inputB.getText());
			output.setText(solution + "");
		});
		
		divideBtn.setOnAction(e ->{ // Division
			solution = Double.parseDouble(inputA.getText()) / Double.parseDouble(inputB.getText());
			output.setText(solution + "");
		});

		HBox buttonLine = new HBox(10, addBtn, subtractBtn, multiplyBtn, divideBtn);
		buttonLine.setLayoutX(100);
		buttonLine.setLayoutY(150);
		
		Pane paneA = new Pane(inputLine, buttonLine);
		
		// Setting the scene
		Scene sceneA = new Scene(paneA, 500, 200);
		mainScene.setTitle("Simple Calculator");
		mainScene.setScene(sceneA);
				
		mainScene.show();
		
	}
	
}
