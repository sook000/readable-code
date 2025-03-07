package cleancode.minesweeper.tobe.cell;

import cleancode.minesweeper.tobe.position.CellPosition;

public interface Cell {


    boolean isLandMine();

    boolean hasLandMineCount();

    CellSnapshot getSnapshot();

    void flag();

    void open();

    boolean isChecked();

    boolean isOpened();
}
