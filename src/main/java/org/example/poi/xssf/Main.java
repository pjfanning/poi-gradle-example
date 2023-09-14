package org.example.poi.xssf;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDateTime;

/**
 * Simplistic example that writes an xlsx file
 */
public class Main {

    public static void main(String[] args) throws Exception {
        String filename = (args.length == 0 || args[0].length() == 0) ? "sample-output.xlsx" : args[0];
        File file = new File(filename);
        try (XSSFWorkbook wb = new XSSFWorkbook()) {
            XSSFSheet sheet = wb.createSheet("TestSheet");
            sheet.createRow(0).createCell(0).setCellValue(LocalDateTime.now());
            try (FileOutputStream fos = new FileOutputStream(file)) {
                wb.write(fos);
            }
        }
        System.out.println("wrote " + file.getAbsolutePath());
    }
}
