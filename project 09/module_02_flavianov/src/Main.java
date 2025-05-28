package app;

import app.database.DataImporter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к XLSX-файлу: ");
        String filePath = scanner.nextLine();

        DataImporter.importFromExcel(filePath);
    }
}