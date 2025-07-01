package main.java.views;

// AlertDialog.java
public class AlertDialog {
    public static void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Ошибка");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static boolean showConfirmation(String message) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Подтверждение");
        alert.setHeaderText("Вы уверены?");
        alert.setContentText(message);
        return alert.showAndWait().get() == ButtonType.OK;
    }
}
