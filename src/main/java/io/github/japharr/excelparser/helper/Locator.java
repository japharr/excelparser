package io.github.japharr.excelparser.helper;

import lombok.Value;

@Value
public class Locator {
    String sheetName;
    int row;
    int col;

    public Locator(String sheetName, int row, int col) {
        this.sheetName = sheetName;
        this.row = row;
        this.col = col;
    }

    public String getSheetName() {
        return sheetName;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
