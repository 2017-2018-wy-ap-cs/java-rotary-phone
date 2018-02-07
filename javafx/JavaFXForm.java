import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.paint.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

/* in the place of auto-import in DrJava 
 * I googled "javafx _______" and clicked on
 * whatever JavaFX 8-type link showed up.
 * Use whatever import appears.
 */
public class JavaFXForm extends Application {
  public static void main(String[] args) {
    launch(args);
  }
  
  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("JavaFX Welcome");
    
    GridPane grid = new GridPane();
    grid.setAlignment(Pos.CENTER);
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setPadding(new Insets(25, 25, 25, 25));
    
    Button btn = new Button("Sign in");
    HBox hbBtn = new HBox(10);
    hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
    hbBtn.getChildren().add(btn);
    grid.add(hbBtn, 1, 4);

    final Text actiontarget = new Text();
    grid.add(actiontarget, 1, 6);
    
    btn.setOnAction(new EventHandler<ActionEvent>() {  
      @Override
      public void handle(ActionEvent e) {
        actiontarget.setFill(Color.FIREBRICK);
        actiontarget.setText("Sign in button pressed");
      }
    });
    
    Scene scene = new Scene(grid, 300, 275);
    primaryStage.setScene(scene);
    
    Text scenetitle = new Text("Welcome");
    scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    grid.add(scenetitle, 0, 0, 2, 1);
    
    Label userName = new Label("User Name:");
    grid.add(userName, 0, 1);
    
    TextField userTextField = new TextField();
    grid.add(userTextField, 1, 1);
    
    Label pw = new Label("Password:");
    grid.add(pw, 0, 2);
    
    PasswordField pwBox = new PasswordField();
    grid.add(pwBox, 1, 2);
    
    // make this one false if you don't want the guide lines to show up
    grid.setGridLinesVisible(true);
    
    primaryStage.show();
  }
  
}