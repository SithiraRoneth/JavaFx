package lk.ijse.JavaFx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {

    public void btnCustomerOnAction(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle("Customer Form");

        stage.show();
    }

    public void btnItemOnAction(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/item_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle("Item Form");

        stage.show();
    }

    public void btnSupplierOnAction(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/supplier_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle("Supplier Form");

        stage.show();
    }
}
