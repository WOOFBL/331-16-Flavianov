package main.java.controllers;

import main.java.models.Partner;
import main.java.views.PartnerFormView;
import main.java.views.PartnerListView;

// MainController.java
public class MainController {
    private Stage primaryStage;

    public void showPartnerList() {
        PartnerListView view = new PartnerListView(this);
        primaryStage.setScene(new Scene(view.getView()));
        primaryStage.setTitle("Список партнёров");
    }

    public void showPartnerForm(Partner partner) {
        PartnerFormView view = new PartnerFormView(this, partner);
        primaryStage.setScene(new Scene(view.getView()));
        primaryStage.setTitle(partner == null ? "Добавление партнёра" : "Редактирование партнёра");
    }
}
