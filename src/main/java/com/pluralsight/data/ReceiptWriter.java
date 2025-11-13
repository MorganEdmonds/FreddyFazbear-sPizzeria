package com.pluralsight.data;

import com.pluralsight.model.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    private static final String receiptFolder = "receipts";

    //this will generate file name based on local date and time.
    public String generateFileName(LocalDateTime localDateTime){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String dateFormatted = localDateTime.format(dateTimeFormatter);
        return dateFormatted +".txt";
    }

    //will check if folder exists, if not one will be made.
    public void ensureReceiptFolderExits(){
        File file = new File(receiptFolder);
        if(file.exists()){
            System.out.println("folder exists writing file");
        } else if (!file.exists()) {
            file.mkdir();
        }

    }

    //This method will save a receipt and write order details.
    //*Each order should have its own receipt file, and it should be named by the date and time that the order was placed
    public void saveReceipt(Order order){
        ensureReceiptFolderExits();
        String fileName = generateFileName(order.getLocalDateTime());
        String filePath = receiptFolder + File.separator + fileName;

        try(FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(order.getOrderDetails());
        } catch (IOException e){
            e.printStackTrace();

        }


    }
}
