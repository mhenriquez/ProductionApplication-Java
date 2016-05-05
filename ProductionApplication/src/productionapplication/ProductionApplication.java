package productionapplication;
import java.util.*;
/**
 * @author Moises Henriquez
 * @date March 27, 2016
 */
public class ProductionApplication {

    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        String txtInput;
        
        Part[] parts = new Part[10];
        int instance = 0;
        int choice = 0;
        
        do{
            System.out.println("Enter your choice:");
            System.out.println("1. Create Purchased Part");
            System.out.println("2. Create Manufactured Part");
            System.out.println("3. Create Subcontracted Part");
            System.out.println("4. Exit");
            txtInput = input.next();
            
            //Check if 1st character of string txt is a digit
            if (Character.isDigit(txtInput.charAt(0))){
                //if yes, parse to integer as my choice
                choice = Integer.parseInt(txtInput);
            }
            
            switch(choice){
                case 1:
                    PurchasedPart myPurchasedPart = new PurchasedPart();
                    
                    System.out.println("Enter the part ID: ");
                    txtInput = input.next();
                    myPurchasedPart.setPartId(Integer.parseInt(txtInput));
                    
                    System.out.println("Enter the part description: ");
                    txtInput = input.next();
                    myPurchasedPart.setPartDescription(txtInput);
                    
                    System.out.println("Enter the part sell price: ");
                    txtInput = input.next();
                    myPurchasedPart.setPartSellPrice(Double.parseDouble(txtInput));
                    
                    System.out.println("Enter the handling cost: ");
                    txtInput = input.next();
                    myPurchasedPart.setHandlingCost(Double.parseDouble(txtInput));
                    
                    System.out.println("Enter the purchase price: ");
                    txtInput = input.next();
                    myPurchasedPart.setPurchasePrice(Double.parseDouble(txtInput));
                    
                    System.out.println("Enter the vendor: ");
                    txtInput = input.next();
                    myPurchasedPart.setVendor(txtInput);
                    
                    parts[instance] = myPurchasedPart;
                    break;
                case 2:
                    ManufacturedPart myManufacturedPart = new ManufacturedPart();
                    
                    System.out.println("Enter the part ID: ");
                    txtInput = input.next();
                    myManufacturedPart.setPartId(Integer.parseInt(txtInput));
                    
                    System.out.println("Enter the part description: ");
                    txtInput = input.next();
                    myManufacturedPart.setPartDescription(txtInput);
                    
                    System.out.println("Enter the part sell price: ");
                    txtInput = input.next();
                    myManufacturedPart.setPartSellPrice(Double.parseDouble(txtInput));
                    
                    System.out.println("Enter the labor cost: ");
                    txtInput = input.next();
                    myManufacturedPart.setLaborCost(Double.parseDouble(txtInput));
                    
                    System.out.println("Enter the material cost: ");
                    txtInput = input.next();
                    myManufacturedPart.setMaterialCost(Double.parseDouble(txtInput));
                    
                    parts[instance] = myManufacturedPart;
                    break;
                case 3:
                    SubcontractedPart mySubcontractedPart = new SubcontractedPart();
                    
                    System.out.println("Enter the part ID: ");
                    txtInput = input.next();
                    mySubcontractedPart.setPartId(Integer.parseInt(txtInput));
                            
                    System.out.println("Enter the part description: ");
                    txtInput = input.next();
                    mySubcontractedPart.setPartDescription(txtInput);
                            
                    System.out.println("Enter the part sell price: ");
                    txtInput = input.next();
                    mySubcontractedPart.setPartSellPrice(Double.parseDouble(txtInput));
                            
                    System.out.println("Enter the labor cost: ");
                    txtInput = input.next();
                    mySubcontractedPart.setLaborCost(Double.parseDouble(txtInput));
                            
                    System.out.println("Enter the material cost: ");
                    txtInput = input.next();
                    mySubcontractedPart.setMaterialCost(Double.parseDouble(txtInput));
                            
                    System.out.println("Enter the subcontract process description: ");
                    txtInput = input.next();
                    mySubcontractedPart.setProcessDescription(txtInput);
                            
                    System.out.println("Enter the subcontract cost: ");
                    txtInput = input.next();
                    mySubcontractedPart.setsubContractCost(Double.parseDouble(txtInput));
                    
                    parts[instance] = mySubcontractedPart;
                    break;
                case 4:
                    //printAll(parts);
                    break;
                default:
                    break;
            }
            
        } while( choice != 5 );
    }
    
    public static void printAll(Part part){
        //
        if(part instanceof PurchasedPart){
            System.out.println("********");
            
        } else if(part instanceof ManufacturedPart){
            System.out.println("********");
            
        }
    }
}
