///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.myproject.CNC;
//
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import javax.swing.JTable;
//import javax.swing.table.TableModel;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import javax.swing.JOptionPane;
//
//public class ExcelExporter {
//
//    public void exportTable(JTable table, String filePath) throws IOException {
//        Workbook workbook = new XSSFWorkbook();
//        Sheet sheet = workbook.createSheet("Sheet1");
//
//        TableModel model = table.getModel();
//
//        // Ghi tiêu đề cột
//        Row headerRow = sheet.createRow(0);
//        for (int i = 0; i < model.getColumnCount(); i++) {
//            Cell cell = headerRow.createCell(i);
//            cell.setCellValue(model.getColumnName(i));
//        }
//
//        // Ghi dữ liệu hàng
//        for (int i = 0; i < model.getRowCount(); i++) {
//            Row row = sheet.createRow(i + 1);
//            for (int j = 0; j < model.getColumnCount(); j++) {
//                Cell cell = row.createCell(j);
//                Object value = model.getValueAt(i, j);
//                if (value != null) {
//                    cell.setCellValue(value.toString());
//                }
//            }
//        }
//
//        // Ghi workbook ra file
//        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
//            workbook.write(fileOut);
//            JOptionPane.showMessageDialog(null, "Xuất file Excel thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
//        } catch (IOException e) {
//            System.out.println("Lỗi khi ghi file: " + e.getMessage());
//            JOptionPane.showMessageDialog(null, "Lỗi khi ghi file: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            workbook.close();
//        }
//    }
//}
//
