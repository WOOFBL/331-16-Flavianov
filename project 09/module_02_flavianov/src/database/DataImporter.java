package app.database;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DataImporter {
    public static void importFromExcel(String filePath) {
        try (FileInputStream file = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(file)) {

            Sheet sheet = workbook.getSheetAt(0); // Первый лист

            try (Connection conn = DatabaseConnector.getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(
                         "INSERT INTO partners (name, phone, rating) VALUES (?, ?, ?)"
                 )) {

                for (Row row : sheet) {
                    if (row.getRowNum() == 0) continue; // Пропуск заголовка

                    String name = row.getCell(0).getStringCellValue();
                    String phone = row.getCell(1).getStringCellValue();
                    int rating = (int) row.getCell(2).getNumericCellValue();

                    pstmt.setString(1, name);
                    pstmt.setString(2, phone);
                    pstmt.setInt(3, rating);
                    pstmt.executeUpdate();
                }

                System.out.println("Данные успешно импортированы!");
            }
        } catch (Exception e) {
            System.err.println("Ошибка импорта: " + e.getMessage());
            e.printStackTrace();
        }
    }
}