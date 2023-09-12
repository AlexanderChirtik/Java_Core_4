package org.example;

public class TwoDimensionalArray {

    private String[][] array = null;

    // В конструкторе сразу идет проверка массива на соответствие размеру 4x4
    TwoDimensionalArray(String[][] array) throws MyArraySizeException{
        this.array = array;
        controlSize();
    }

    public String[][] getArray() {
        return array;
    }


    /**
     * Метод собирает сумму всех элементов массива
     * @return
     * @throws MyArrayDataException в процессе подсчета суммы идет проверка каждого элемента массива
     * на успешность преобразования к типу int
     */
    public int sumElements () throws MyArrayDataException {
        String[][] tempArray = array;
        int sum = 0;
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < tempArray[i].length; j++) {
                try{
                    sum += Integer.parseInt(tempArray[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException("Получено не числовое значение в ячейке array ", i, j);
                }
            }
        }
        return sum;
    }

    /**
     * Метод проверяет размер массива
     * @throws MyArraySizeException
     */
    private void controlSize() throws MyArraySizeException{
        if (array.length != 4) throw new MyArraySizeException("Размер массива не соответсвует нужному (4х4)");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) throw new MyArraySizeException("Размер массива не соответсвует нужному (4х4)");
        }
    }
}
