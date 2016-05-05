package productionapplication;

/**
 * @author Moises Henriquez
 * @date March 27, 2016
 */
public class PurchasedPart extends Part {
    //Instance variables
    
    private double handlingCost;
    private double purchasePrice;
    private String vendor;
    
    //Constant
    
    public static final String DEFAULT_VENDOR_NAME = "no vendor name";
    
    //Constructors
    
    public PurchasedPart(){
        this(0, 0, 0, DEFAULT_VENDOR_NAME);
    }
    
    public PurchasedPart(int ID){
        this(ID, 0, 0, DEFAULT_VENDOR_NAME);
    }
    public PurchasedPart(int ID, double hCost, double pPrice, String vendor){
        
        this(ID, Part.DEFAULT_DESCRIPTION, 0, hCost, pPrice, vendor);
    }
    public PurchasedPart(int ID, String partDesc, double sellPrice, double hCost, double pPrice, String vendor){
        super(ID, partDesc, sellPrice);
        this.setHandlingCost(hCost);
        this.setPurchasePrice(pPrice);
        this.setVendor(vendor);
    }
    
    //Methods
    
    @Override
    public double getProductCost() {
        return purchasePrice + handlingCost;
    }
    
    public double getHandlingCost(){
        return handlingCost;
    }
    public void setHandlingCost(double newHandlingCost){
        if(newHandlingCost >=0){
            handlingCost = newHandlingCost;
        }
    }
    
    public double getPurchasePrice(){
        return purchasePrice;
    }
    public void setPurchasePrice(double newPurchasePrice){
        if(newPurchasePrice >=0){
            purchasePrice = newPurchasePrice;
        }
    }
    
    public String getVendor(){
        return vendor;
    }
    public void setVendor(String newVendor){
        if(newVendor != null){
            vendor = newVendor;
        }
    }
    
    public String toString(){
        return super.toString() + "\n" +
                "Purchase Price: " + getPurchasePrice() + "\n" +
                "Vendor: " + getVendor() + "\n" +
                "Handling Cost: " + getHandlingCost();
    }
}
