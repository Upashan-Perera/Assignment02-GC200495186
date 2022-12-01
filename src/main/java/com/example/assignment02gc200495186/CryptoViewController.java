package com.example.assignment02gc200495186;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class CryptoViewController implements Initializable {

    @FXML
    private ImageView cryptoImageView;

    @FXML
    private ListView<Crypto> cryptoListView;

    @FXML
    private Button detailsButton;

    @FXML
    private Label msgLabel;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchTextField;

    @FXML
    void search(ActionEvent event) throws IOException, InterruptedException {
        cryptoListView.getItems().clear();
        String searchTerm = searchTextField.getText();

        APIResponse apiResponse = APIUtility.getCryptoFromCoinGecko(searchTerm);

        if(apiResponse.getResponse()) {
            cryptoListView.getItems().addAll(apiResponse.getCoins());

            msgLabel.setVisible(false);
            cryptoListView.setVisible(true);
            detailsButton.setVisible(true);
        }
        else {
            cryptoListView.setVisible(false);
            detailsButton.setVisible(false);
            msgLabel.setVisible(true);
            cryptoImageView.setVisible(false);
            msgLabel.setText("No Results found");
        }

    }

    @FXML
    void detailsButton(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        cryptoListView.setVisible(false);
        detailsButton.setVisible(false);
        msgLabel.setVisible(false);

        cryptoListView.getSelectionModel().selectedItemProperty().addListener((obs,old,cryptoSelected)->{
            if(cryptoSelected!=null){
                try{
                    cryptoImageView.setImage(new Image(cryptoSelected.getLarge()));
                }
                catch (IllegalArgumentException e) {
                    cryptoImageView.setImage(new Image(Main.class.getResourceAsStream("images/Bitcoin.svg.png")));
                }
            }else {
                cryptoImageView.setVisible(false);
            }
        });
    }
}
