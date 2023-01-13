package assquestion1;

// importing a scanner for user input.
// importing an array list for users inputs to be stored in an array and accessed later if needed.
import java.util.Scanner;
import java.util.ArrayList;

// @author 20118232
public class AssQuestion1 {

    // declrations for making the variables global meaning they can be accessed by other methods. 
    static ArrayList<String> productCode = new ArrayList<String>();
        static ArrayList<String> productName = new ArrayList<String>();
        static ArrayList<String> category = new ArrayList<String>();
        static ArrayList<String> warranty = new ArrayList<String>();
        static ArrayList<Double> price = new ArrayList<Double>();
        static ArrayList<Double> stock = new ArrayList<Double>();
        static ArrayList<String> supplier = new ArrayList<String>();
        static Scanner input = new Scanner (System.in);
        
    public static void main(String[] args) {
        // Declarations.
        String answer, ans="1"; 
        
        //start of application Output.
        System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATIONS \n" 
                         + "**************************************** \n");
        while(ans.equals("1")){
        
        //output
        System.out.println(  "Enter (1) to lauch menu or any other key to exit");
        ans = input.next();
            
        if(ans.equals("1")) {
            displayMenu();
            answer = input.next();
        
        switch (answer) {
                case "1":
                    captureProduct();
                break; 
                case "2":
                    searchProduct();
                break;
                case "3":
                    updateProduct();
                break;
                case "4":
                    deleteProduct();
                break;
                case "5":
                    printReport();
                break;
                case "6":
                    exitApplication();
                break;
                }
        }  
        else {
            ans= "-1";
        }
    }
        
        
        
    }
    // creating the displayMenu method
    public static void displayMenu(){ 
            System.out.print("Please select one of the following menu items: \n"
                    + "(1) Capture a new product. \n"
                    + "(2) Search for a product. \n"
                    + "(3) Update a product. \n"
                    + "(4) Delete a product. \n"
                    + "(5) Print report. \n"
                    + "(6) Exit Application. \n");
            
        }
    // creating the captureProduct method
    public static void captureProduct(){
            //declarations
            String prodIndex;
            String answer;
            
            // outputs asking for users inputs
            System.out.println("CAPTURE A NEW PRODUCT \n"
                          + "************************");
            System.out.println("Enter the prodcut code: ");
            productCode.add(input.next());
                 
            System.out.println("Enter the product name: ");
            prodIndex = input.next();
            productName.add(prodIndex);
            
            
            System.out.println("Select the product category:"
                    + " \n" 
                          + "Desktop Computer - 1 \n"
                          + "Laptop - 2 \n"
                          + "Tablet - 3 \n"
                          + "Printer - 4 \n"
                          + "Gaming Console - 5 \n \n");
            answer = input.next();
            
            // making a switch statement for product categories to be recognised by users inputs. 
            // user inputs a number and the code set back is stored in an array 
            switch (answer) {
                case "1":
                    category.add("Desktop Computer");
                break; 
                case "2":
                    category.add("Laptop");
                break;
                case "3":
                    category.add("Tablet");
                break;
                case "4":
                    category.add("Printer");
                break;
                case "5":
                    category.add("Gaming Console");
                break;
                }
            
            // finding out the warranty of the product
            System.out.println("Indicate the product warranty. Enter (1) for 6 months and any other key for 2 years");
            answer = input.next();
            // creating a switch statement to find out what the warrenty is on the product
            switch (answer) {
                case "1":
                    warranty.add("6 months");
                break; 
                default:
                    warranty.add("2 years");
                break;
                }
            
            
            System.out.println("Enter the price for " + prodIndex + " >>> ");
            price.add(input.nextDouble());
            
            System.out.println("Enter the stock level for " + prodIndex + " >>> ");
            stock.add(input.nextDouble());
            
            System.out.println("Enter the supplier for " + prodIndex + " >>> ");
            supplier.add(input.next());
            
            System.out.println("The prodcut has been saved successfully!!");
               
        }
    
    public static void searchProduct(){
    String search;
    int found =1;
    System.out.println("Please enter the product code to search: ");
    search = input.next();
    
    for (int i = 0; i < productCode.size(); i++) {
        
        if (productCode.get(i).equals(search)) {
            System.out.println("********************************************************\n"
                    + "PRODUCT SEARCH RESULTS\n"
                    + "********************************************************\n"
                    + "PRODUCT CODE: \t\t\t" + productCode.get(i)+ "\n"
                    + "PRODUCT NAME: \t\t\t" + productName.get(i)+ "\n"
                    + "PRODUCT WARRANTY: \t\t" + warranty.get(i)+ "\n"
                    + "PRODUCT CATEGORY: \t\t" + category.get(i)+ "\n"
                    + "PRODUCT PRICE: \t\t\t" + price.get(i)+ "\n"
                    + "PRODUCT STOCK LEVELS: \t\t" + stock.get(i)+ "\n"
                    + "PRODUCT SUPPLIER: \t\t" + supplier.get(i)+ "\n");
            found=0;
            break;
        }
        
    }
    
    if (found == 1) {
        System.out.println("The product cannot be located. Invalid product");
    }
    }
    
    public static void exitApplication () {
        System.exit(0);
    }
    
    public static void deleteProduct(){
        
        String TempCode, confirm;
        int index = -1;
        
        System.out.println("Enter the product code you would like to delete");
        TempCode = input.next();
        
        for (int i = 0; i < productCode.size(); i++) {
            
            if (productCode.get(i).equals(TempCode)){
                    index = i;
                    break;
                }
            
            
        }
        System.out.println("Are you sure that you want to delete this product (y) Yes (n) No");
        confirm = input.next();
        
        if (confirm .equals("y")) {
            productCode.remove(index);
            productName.remove(index);
            warranty.remove(index);
            category.remove(index);
            price.remove(index);
            stock.remove(index);
            supplier.remove(index);
                
        }
    
    
    
    }
    
    // the printing of the products that have been enetered 
    public static void printReport(){
        
        // instantiating the reportdata class 
        ReportData rp = new ReportData();
    System.out.println("PRODUCT REPORT ");
    for (int i = 0; i < productCode.size(); i++) {
        
            System.out.println("==================================================\n"
                    + "PRODUCT " + i + "\n"
                    + "--------------------------------------------------\n"
                    + "PRODUCT CODE: \t\t\t" + productCode.get(i)+ "\n"
                    + "PRODUCT NAME: \t\t\t" + productName.get(i)+ "\n"
                    + "PRODUCT WARRANTY: \t\t" + warranty.get(i)+ "\n"
                    + "PRODUCT CATEGORY: \t\t" + category.get(i)+ "\n"
                    + "PRODUCT PRICE: \t\t\t" + price.get(i)+ "\n"
                    + "PRODUCT STOCK LEVELS: \t\t" + stock.get(i)+ "\n"
                    + "PRODUCT SUPPLIER: \t\t" + supplier.get(i)+ "\n"
                    + "--------------------------------------------------");

        }
        
}
    
    // the method which allows users to update the products by using the product code
    public static void updateProduct() {
        String tempCode;
        int index= -1;
        String res;
        String Warrenty;
        double Price, Stock;
        
        System.out.println("Please enter the product code to update");
        tempCode = input.next();
        
            for (int i = 0; i < productCode.size(); i++) {
                if (productCode.get(i).equals(tempCode)){
                    index = i;
                    break;
                }
            }
                if (index != -1 ){
                    System.out.println("Would you like to update the warrenty? (y) Yes, (n) No ");
                    res = input.next();
                            if (res.equals("y")){
                            System.out.println("Indicate the product warranty. Enter (1) for 6 months and any other key for 2 years");
                            Warrenty = input.next();
            
                                switch (Warrenty) {
                                    case "1":
                                        warranty.set(index, "6 months");
                                    break; 
                                    default:
                                            warranty.set(index, "2 years");
                                    break;
                                    }
                            }
                    System.out.println("Would you like to update the Stock Levels ? (y) Yes, (n) No");
                    res = input.next();
                    if (res.equals("y")){
                        System.out.println("Please enter the new stock level");
                        Stock = input.nextDouble();
                        
                        stock.set(index, Stock);
                    }
                    
                    System.out.println("Would you like to updaqte the price ? (y) Yes, (n) No");
                    res = input.next();
                    if (res.equals("y")){
                        System.out.println("Please enter the new price");
                        Price = input.nextDouble();
                        
                        price.set(index, Price);
                    }
                    
                    
                        
                
            }else {
                    System.out.println("The product cannot be located. Invalid product");
                }
    }
    
}
