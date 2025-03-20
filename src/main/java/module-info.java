module principal.lojamvc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens controller to javafx.fxml; //abre o controller em alguma pasta
    
    exports principal; //Abre o projeto
}
