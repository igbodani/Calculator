module Calculator.app.main {
    requires javafx.controls;
    requires  javafx.graphics;
    requires com.google.common;
    requires com.google.gson;
    opens edu.isu.cs.student;
    exports edu.isu.cs.student;
}