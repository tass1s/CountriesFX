module gr.unipi.CountriesFX {
    requires javafx.controls;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;
    requires org.apache.httpcomponents.httpcore;
    requires org.apache.httpcomponents.httpclient;

    // Open package to Jackson Databind
    opens gr.unipi.CountriesFX to com.fasterxml.jackson.databind;
    exports gr.unipi.CountriesFX to javafx.graphics;
}
