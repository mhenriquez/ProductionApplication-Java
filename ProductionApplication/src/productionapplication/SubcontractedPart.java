package productionapplication;

/**
 * @author Moises Henriquez
 * @date March 27, 2016
 */
public class SubcontractedPart extends ManufacturedPart {
    //Instance variables
    
    private String processDescription;
    private double subContractCost;
    
    //Constant
    
    public static final String DEFAULT_PROCESS_DESCRIPTION = "no process desc";
    
    //Constructors
    
    public SubcontractedPart(){
        this(0, DEFAULT_PROCESS_DESCRIPTION, 0);
    }
    
    public SubcontractedPart(int ID){
        this(ID, DEFAULT_PROCESS_DESCRIPTION, 0);
    }
    
    public SubcontractedPart(int ID, String processDesc, double sCost){
        super(ID, 0, 0);
        this.setProcessDescription(processDesc);
        this.setsubContractCost(sCost);
    }
    
    public SubcontractedPart(int ID, String partDesc, double sellPrice, double lCost, double mCost, String processDesc, double sCost){
        super(ID, partDesc, sellPrice, lCost, mCost);
        this.setProcessDescription(processDesc);
        this.setsubContractCost(sCost);
    }
    
    //Methods
    
    @Override
    public double getProductCost(){
        return super.getProductCost() + subContractCost;
    }
    
    public String getProcessDescription(){
        return processDescription;
    }
    public void setProcessDescription(String newProcessDescription){
        if(newProcessDescription != null){
            processDescription = newProcessDescription;
        }
    }
    
    public double getSubContractCost(){
        return subContractCost;
    }
    public void setsubContractCost(double newSubcontractCost){
        if(newSubcontractCost >=0){
            subContractCost = newSubcontractCost;
        }
    }
    
    public String toString(){
        return super.toString() +  "\n" + 
                "Process Description: " + getProcessDescription() + "\n" + 
                "Subcontract Cost: " + getSubContractCost();
    }
}
