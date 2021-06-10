package oms;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oms.model.Datasource;
import oms.model.Orphan;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;


public class Main extends Application {
     public static Stage stage;

    @Override
    public void init() throws Exception {
        super.init();
        if(!Datasource.getInstance().open()){
//            TODO Create popup that says couldn't connect to db
//            System.out.print("""
//
//                    >>>>>>>>>>
//                    >>>>>>>>>>
//                    >>>>>>>>>>
//                    [FATAL ERROR]: Couldn't connect to database. Application is exiting!
//                    >>>>>>>>>>
//                    >>>>>>>>>>
//                    >>>>>>>>>>
//
//                    """);

            Platform.exit();
        }
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        Datasource.getInstance().close();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Main.stage = stage;

        Parent root = FXMLLoader.load(getClass().getResource("fx/LoginPage.fxml"));


        Scene scene = new Scene(root, 1200, 700);

        stage.setTitle("Orphan Department");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) throws FileNotFoundException, SQLException {
//        Datasource.getInstance().open();
//        File file = new File("C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/2.jpg");
////        FileInputStream stream = new FileInputStream(file);
////        System.out.println(file.getAbsolutePath());
////        String sql = "update father set deathCertificate=load_file (?) where id=?";
////        Datasource.getInstance().inputImageToDB(file, 9, sql);
//        int x = Datasource.getInstance().insertFather("sixth", "last", "2013-02-04",
//                "cause of death", "2013-09-04", file);
//        System.out.println(x);
        launch(args);
    }
    
}
