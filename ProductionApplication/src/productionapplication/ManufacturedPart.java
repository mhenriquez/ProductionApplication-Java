package productionapplication;

/**
 * @author Moises Henriquez
 * @date March 27, 2016
 */
public class ManufacturedPart extends Part {
     //Instance variables
    
    private double laborCost;
    private double materialCost;
    
    //Constructors
    
    public ManufacturedPart(){
        this(0, 0, 0);
    }
    
    public ManufacturedPart(int ID){
        this(ID, 0, 0);
    }
    
    public ManufacturedPart(int ID, double lCost, double mCost){
        this(ID, Part.DEFAULT_DESCRIPTION, 0, lCost, mCost);
    }
    
    public ManufacturedPart(int ID, String partDesc, double sellPrice, double lCost, double mCost){
        super(ID, partDesc, sellPrice);
        this.setLaborCost(lCost);
        this.setMaterialCost(mCost);
    }
    
    //Methods
    
    @Override
    public double getProductCost(){
        return laborCost + materialCost;
    }
    
    public double getLaborCost(){
        return laborCost;
    }
    public void setLaborCost(double laborCost){
        if(laborCost >= 0){
            laborCost = laborCost;
        }
    }
    
    public double getMaterialCost(){
        return materialCost;
    }
    public void setMaterialCost(double materialCost){
        if(materialCost >= 0){
            materialCost = materialCost;
        }
    }
    
    public String toString(){
        return super.toString() + "\n" + 
                "Labor Cost: " + getLaborCost()  + "\n" + 
                "Material Cost: " + getMaterialCost();
    }
}
