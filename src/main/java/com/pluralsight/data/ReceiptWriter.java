package com.pluralsight.data;

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
    public void ensureReceiptFolderExits(){}

    //This method will save a receipt and write order details.
    public void saveReceipt(){}
}
