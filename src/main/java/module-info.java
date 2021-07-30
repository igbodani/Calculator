module Calculator.main {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires com.google.gson;
    requires com.google.common;
    exports edu.isu.projects to com.google.gson;
    opens edu.isu.projects;
}