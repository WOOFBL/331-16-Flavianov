package app.ui.component;

import app.model.Partner;

import javax.swing.*;
import java.awt.*;

public class PartnerCard extends JPanel {
    public PartnerCard(Partner partner) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JLabel nameLabel = new JLabel(partner.getCompanyName());
        JLabel directorLabel = new JLabel("Директор: " + partner.getDirectorName());
        JLabel ratingLabel = new JLabel("Рейтинг: " + partner.getRating());

        add(nameLabel);
        add(directorLabel);
        add(ratingLabel);
    }
}
