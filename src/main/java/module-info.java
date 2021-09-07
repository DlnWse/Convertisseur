module fr.dylan.convertisseur {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.dylan.convertisseur to javafx.fxml;
    exports fr.dylan.convertisseur;
}