package fr.dylan.convertisseur;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ConvertController implements Initializable {

    private Double rate = 1.18d; // Taux euro vers dollar

    @FXML
     TextField tfEuro;

    @FXML
    Label lblDollar;

    @FXML
    public void onConvertAction() {
        Double euro = Double.parseDouble(tfEuro.getText()) ;
        System.out.println(euro);
        Double Calcul = euro * rate;
       String Res = " " + (Math.round(Calcul*100.0)/100.0);
       lblDollar.setText(Res);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourcebundle) {
        lblDollar.setText("0");
    };

};
