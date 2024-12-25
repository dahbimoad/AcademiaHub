module org.academiahub.academiahub {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.academiahub.academiahub to javafx.fxml;
    exports org.academiahub.academiahub;
}