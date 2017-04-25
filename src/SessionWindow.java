import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SessionWindow extends Application {
    public SessionWindow() {
        Platform.runLater( () -> start( new Stage() ) );
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene( new HBox(), 200, 200 );
        primaryStage.setTitle( "Server" );
        primaryStage.setScene( scene );
        primaryStage.show();
    }
}
