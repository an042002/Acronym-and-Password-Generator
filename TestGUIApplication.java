/**
This represents the GUI for the string generator class
@author Abhiiraj Nikam   Student Id-3701853
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TestGUIApplication extends Application {
    private TextField input; 
    private Text greetingText;

    public void start(Stage primaryStage){  
		
		primaryStage.setTitle("String Generator");
		
		Label fieldLabel = new Label("Enter a Title or phrase:");
		
		Button actionButton1 = new Button("Generate Acronym");
		actionButton1.setOnAction(this::acronymConversion);
		
		Button actionButton2 = new Button("Generate Password");
		actionButton2.setOnAction(this::passwordConversion);
		
		Button actionButton3 = new Button("Reset");
		actionButton3.setOnAction(this::resetConversion);
		
		input = new TextField();
		input.setPrefWidth(450);
		
		greetingText = new Text("Let's create an acronym or password!");
		
		FlowPane pane = new FlowPane(fieldLabel,input,actionButton1,actionButton2, actionButton3,greetingText);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(60);
		pane.setVgap(60);
		
		Scene scene = new Scene(pane,475,300);
		
		primaryStage.setScene(scene);
		primaryStage.show();
     }
     public void acronymConversion(ActionEvent event){
         String result = input.getText();
         String output = StringGenerator.generateAcronym(result);
         greetingText.setText(output);    
     }
     public void passwordConversion(ActionEvent event) {
         String result = input.getText();
         String output = StringGenerator.generatePassword(result);
         greetingText.setText(output);
     }
     public void resetConversion(ActionEvent event) {
         greetingText.setText("Let's create an acronym or password!");
         input.setText("");
        }
}