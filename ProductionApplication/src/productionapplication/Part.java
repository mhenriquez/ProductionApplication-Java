package productionapplication;

/**
 * @author Moises Henriquez
 * @date March 27, 2016
 */
public abstract class Part {
    //Instance variables
    
    private int partId;
    private String partDescription;
    private double partSellPrice;
    
    //Constant
    
    public static final String DEFAULT_DESCRIPTION = "no part desc";
    
    //Constructors
    
    public Part(int ID){
        this(ID, DEFAULT_DESCRIPTION, 0);
    }
    
    public Part(int ID, String partDesc, double sellPrice){
        this.setPartId(ID);
        this.setPartDescription(partDesc);
        this.setPartSellPrice(sellPrice);
    }
    
    //Methods
    
    public abstract double getProductCost();
    
    public int getPartId(){
        return partId;
    }
    public void setPartId(int newPartId){
        if(newPartId >= 0){
            partId = newPartId;
        }
    }
    
    public String getPartDescription(){
        return partDescription;
    }
    public void setPartDescription(String newPartDescription){
        if(newPartDescription != null){
            partDescription = newPartDescription;
        }
    }
    
    public double getPartSellPrice(){
        return partSellPrice;
    }
    public void setPartSellPrice(double newPartSellPrice){
        if(newPartSellPrice >= 0){
            partSellPrice = newPartSellPrice;
        }
    }
    
    public String toString(){
        return "Part ID: " + this.getPartId() + "\n" + 
                "Dscription: " + this.getPartDescription() + "\n" + 
                "Sell Price: " + this.getPartSellPrice();
    }
}
