package com.example.assignment02gc200495186;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChanger {

    public static void changeScenes(ActionEvent event, String fxmlFileName, CryptoDetail cryptoDetail) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("cryptoDetail-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        /**
         * Here we are using a custom intializable method to get the cryptoDetail value parsed from the controller
         */
        CryptoDetailInitializable controller = fxmlLoader.getController();
        controller.loadCryptoDetails(cryptoDetail);

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("CryptoAPI!");
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("images/Bitcoin.svg.png")));
        stage.setScene(scene);
        stage.show();

    }

    /**
     * This is the Scene changer class using to go back from the cryptoDetail view
     * @param event
     * @param fxmlFileName
     * @throws IOException
     */
    public static void changeScenes(ActionEvent event, String fxmlFileName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFileName));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("CryptoAPI!");
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("images/Bitcoin.svg.png")));
        stage.setScene(scene);
        stage.show();
    }
}
