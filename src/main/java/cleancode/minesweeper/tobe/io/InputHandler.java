package cleancode.minesweeper.tobe.io;

import cleancode.minesweeper.tobe.position.CellPosition;

public interface InputHandler {

    CellPosition getCellPositionFromUser();

    String getUserInput();
}
