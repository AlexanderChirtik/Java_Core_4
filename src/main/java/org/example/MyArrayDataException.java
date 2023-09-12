package org.example;

public class MyArrayDataException extends MyArrayException {

    private final int rowPosition;
    private final int columnPosition;

    public MyArrayDataException(String message, int rowPosition, int columnPosition) {
        super(message);
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }
}
