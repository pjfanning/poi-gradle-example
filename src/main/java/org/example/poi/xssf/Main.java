package org.example.poi.xssf;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;

/**
 * Simplistic example that reads first sheet of an xlsx file and prints the cell values.
 * <p>
 * If you don't provide a filename as an argument, it will use the Sample-Sales-Data.xlsx in this project's base dir.
 */
public class Main {

    private static int CELL_DISPLAY_LENGTH = 20;

    public static void main(String[] args) throws Exception {
        String filename = (args.length == 0 || args[0].length() == 0) ? "Sample-Sales-Data.xlsx" : args[0];
        File file = new File(filename);
        DataFormatter dataFormatter = new DataFormatter();
        try (XSSFWorkbook wb = new XSSFWorkbook(file)) {
            XSSFSheet sheet = wb.getSheetAt(0);
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(padOrTruncate(dataFormatter.formatCellValue(cell)));
                }
                System.out.println("");
            }
        }
    }

    private static String padOrTruncate(String input) {
        if (input.length() >= CELL_DISPLAY_LENGTH) {
            return input.substring(0, CELL_DISPLAY_LENGTH - 1) + " ";
        } else {
            String newText = input;
            while (newText.length() < CELL_DISPLAY_LENGTH) {
                newText = newText + " ";
            }
            return newText;
        }
    }
}
