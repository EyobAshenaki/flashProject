package oms.fx;

import javafx.fxml.Initializable;
import javafx.scene.chart.ScatterChart;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class EducationalRecordsController implements Initializable {
    public AnchorPane educationalRecords;
    public ScrollPane scrollPane;
    public ImageView imageView_1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File file = new File("place_holder_db.jpg");
        InputStream stream = null;
        try {
            stream = new FileInputStream(file.getAbsoluteFile());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image = new Image(stream);
        imageView_1.setImage(image);


    }

}
