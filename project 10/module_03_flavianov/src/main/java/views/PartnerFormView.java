package main.java.views;

import main.java.controllers.MainController;
import main.java.models.Partner;
import main.java.models.PartnerType;

import java.awt.*;

// PartnerFormView.java
public class PartnerFormView {
    private final TextField nameField = new TextField();
    private final ComboBox<PartnerType> typeComboBox = new ComboBox<>();
    private final Spinner<Integer> ratingSpinner = new Spinner<>(0, Integer.MAX_VALUE, 0);

    public PartnerFormView(MainController controller, Partner partner) {
        // Инициализация полей
        nameField.setPromptText("Наименование");
        ratingSpinner.setTooltip(new Tooltip("Рейтинг должен быть ≥ 0"));

        if (partner != null) {
            nameField.setText(partner.getName());
            typeComboBox.setValue(partner.getType());
            ratingSpinner.getValueFactory().setValue(partner.getRating());
        }
    }
}
