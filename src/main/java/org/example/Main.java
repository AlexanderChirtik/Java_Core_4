package org.example;

public class Main {
    public static void main(String[] args) {
        // Подходящий под задачу двумерный массив строк
        String[][] array1 = {{"1", "5", "21", "4"},{"6", "11", "9", "4"}, {"7", "7", "10", "9"}, {"16", "19", "13", "7"}};

        // Двумерный массив строк размером 5x5
        String[][] array2 = {{"1", "5", "21", "4", "7"},{"6", "11", "9", "4", "7"}, {"7", "7", "10", "9", "7"}, {"16", "19", "13", "7", "7"}};

        // Двумерный массив строк с "?" вместо одного из значений
        String[][] array3 = {{"1", "5", "21", "4"},{"6", "11", "?", "4"}, {"7", "7", "10", "9"}, {"16", "19", "13", "7"}};



        try{
            TwoDimensionalArray array = new TwoDimensionalArray(array3);
            System.out.println(array.sumElements());
        }
        catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }
        catch (MyArrayDataException e){
            System.out.println(e.getMessage() + e.getRowPosition() + " " + e.getColumnPosition());
        }
    }
}