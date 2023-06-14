package egyptairways;
/**
 *
 * @author muhammed ismaiel AOU ID :2051710881
 */
import javafx.application.Application; 
import static javafx.application.Application.launch;
import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.GridPane;
import javafx.stage.Stage; 

public class EgyptAirWays {
public void start(Stage primaryStage) 
{   
    Airways m = new Airways();
    Label flight = new Label("Flight number");
    Label debcity = new Label("deparurecity");
    Label arrcity = new Label("arrivalcity");
    TextField flighttx = new TextField();
     TextField debtx = new TextField();
      TextField arrtx = new TextField();
      Button adb = new Button ("Add");
      GridPane pane = new GridPane();
      primaryStage.setTitle("Egypt Air");
      pane.addColumn(0, flight,debcity,arrcity,adb);
      pane.addColumn(1, flighttx,debtx,arrtx);
      Scene scene = new Scene(pane);
      primaryStage.setScene(scene);
      primaryStage.show();
      adb.setOnAction(e->{int p=Integer.parseInt(flighttx.getText());String x=(debtx.getText());String z=(arrtx.getText()); Flight f = new Flight(p,x,z);});

}
    public static void main(String[] args) {
        launch (args);}
    
}