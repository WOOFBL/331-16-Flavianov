package app.ui.dialogs;

import javax.swing.*;
import java.awt.*;

public class PartnerDialog extends JDialog {
    public PartnerDialog(JFrame parent) {
        super(parent, "Добавить партнёра", true);
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Тип:"));
        add(new JTextField());
        add(new JLabel("Название компании:"));
        add(new JTextField());
        add(new JLabel("Юридический адрес:"));
        add(new JTextField());
        add(new JLabel("ИНН:"));
        add(new JTextField());
        add(new JLabel("Директор:"));
        add(new JTextField());
        add(new JLabel("Рейтинг:"));
        add(new JTextField());

        JButton saveButton = new JButton("Сохранить");
        add(saveButton);
    }
}
