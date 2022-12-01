package com.example.assignment02gc200495186;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CryptoDetailViewController implements Initializable, CryptoDetailInitializable {

    @FXML
    private GridPane gridPane;

    @FXML
    private ImageView imageView;

    @FXML
    private Label marketRankLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private Label symbolLabel;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event,"crypto-view.fxml");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    @Override
    public void loadCryptoDetails(CryptoDetail cryptoDetail) {
        /**
         * Populating the results through cryptoDetails
         */
        nameLabel.setText(cryptoDetail.getName());
        symbolLabel.setText(cryptoDetail.getSymbol());
        marketRankLabel.setText(cryptoDetail.getMarket_cap_rank());

    }
}
