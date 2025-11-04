module chat.app.practice {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;




    exports lk.ijse;
    opens lk.ijse to javafx.fxml;
    exports lk.ijse.Controller;
    opens lk.ijse.Controller to javafx.fxml;

}