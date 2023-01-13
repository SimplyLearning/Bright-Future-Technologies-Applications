
package assquestion1;

// @author 20118232

import java.util.ArrayList;
import java.util.Scanner;

public class ReportData {
        static ArrayList<String> productCode = new ArrayList<String>();
        static ArrayList<String> productName = new ArrayList<String>();
        static ArrayList<String> category = new ArrayList<String>();
        static ArrayList<String> warranty = new ArrayList<String>();
        static ArrayList<Double> price = new ArrayList<Double>();
        static ArrayList<Double> stock = new ArrayList<Double>();
        static ArrayList<String> supplier = new ArrayList<String>();
        static Scanner input = new Scanner (System.in);

public void reportData(){
    
}

    public static ArrayList<String> getProductCode() {
        return productCode;
    }

    public static void setProductCode(ArrayList<String> productCode) {
        ReportData.productCode = productCode;
    }

    public static ArrayList<String> getProductName() {
        return productName;
    }

    public static void setProductName(ArrayList<String> productName) {
        ReportData.productName = productName;
    }

    public static ArrayList<String> getCategory() {
        return category;
    }

    public static void setCategory(ArrayList<String> category) {
        ReportData.category = category;
    }

    public static ArrayList<String> getWarranty() {
        return warranty;
    }

    public static void setWarranty(ArrayList<String> warranty) {
        ReportData.warranty = warranty;
    }

    public static ArrayList<Double> getPrice() {
        return price;
    }

    public static void setPrice(ArrayList<Double> price) {
        ReportData.price = price;
    }

    public static ArrayList<Double> getStock() {
        return stock;
    }

    public static void setStock(ArrayList<Double> stock) {
        ReportData.stock = stock;
    }

    public static ArrayList<String> getSupplier() {
        return supplier;
    }

    public static void setSupplier(ArrayList<String> supplier) {
        ReportData.supplier = supplier;
    }
    
}
