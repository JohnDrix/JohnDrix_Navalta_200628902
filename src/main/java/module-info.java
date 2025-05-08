module org.example.comp1011spring2025thursday {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.comp1011spring2025thursday to javafx.fxml;
    exports org.example.comp1011spring2025thursday;
}