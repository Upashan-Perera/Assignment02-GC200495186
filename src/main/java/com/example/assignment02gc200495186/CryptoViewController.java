package com.example.assignment02gc200495186;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class CryptoViewController implements Initializable {

    @FXML
    private ListView<Crypto> cryptoListView;

    @FXML
    private Button detailsButton;

    @FXML
    private Button searchButton;

    @FXML
    void search(ActionEvent event) throws IOException, InterruptedException {
        String searchTerm = searchTextField.getText();

        cryptoListView.getItems().addAll(APIUtility.getCryptoFromCoinGecko(searchTerm));

        cryptoListView.setVisible(true);
    }

    @FXML
    private TextField searchTextField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        cryptoListView.setVisible(false);
        detailsButton.setVisible(false);
    }
}
