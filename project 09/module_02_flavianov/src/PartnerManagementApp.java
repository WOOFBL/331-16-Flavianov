package app;

import app.database.DataImporter;
import app.database.DatabaseConnector;
import app.model.Partner;
import app.ui.component.PartnerCard;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PartnerManagementApp {

    private JFrame frame;
    private JPanel mainPanel;

    public PartnerManagementApp() {

        frame = new JFrame("Управление партнёрами");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Настройка стилей
        Font segoe = new Font("Segoe UI", Font.PLAIN, 12);
        UIManager.put("Label.font", segoe);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(new Color(0xF4, 0xE8, 0xD3));

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.add(scrollPane);

        loadPartnersFromDB();
        frame.setVisible(true);
    }

    private void loadPartnersFromDB() {
        List<Partner> partners = new ArrayList<>();
        try (Connection conn = DatabaseConnector.getConnection()) {

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM partners");

            while (rs.next()) {
                Partner partner = new Partner(
                        rs.getInt("partner_id"),
                        rs.getString("type"),
                        rs.getString("company_name"),
                        rs.getString("legal_address"),
                        rs.getString("inn"),
                        rs.getString("director_name"),
                        rs.getInt("rating")
                );
                partners.add(partner);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Partner partner : partners) {
            JPanel card = new PartnerCard(partner);
            mainPanel.add(card);
            mainPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Добавляем отступ между карточками
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(PartnerManagementApp::new);
    }
}
