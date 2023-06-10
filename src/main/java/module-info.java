module com.game.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.game.tictactoe to javafx.fxml;
    exports com.game.tictactoe;
}