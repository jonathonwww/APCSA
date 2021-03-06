public class Commission extends Hourly {
    private double totalSales;
    private double commRate;
    
    /**
     * Constructor -- creates Hourly with a rate of commission
     * 
     * @param commRate Rate of commission
     */
    public Commission (String name,
                        String address, 
                        String phone, 
                        String social, 
                        double hourlyRate, 
                        double commRate) {
        super(name, address, phone, social, hourlyRate);
        this.commRate = commRate;
        totalSales = 0;
    }
    
    /**
     * Adds sales to this staffmember's total sales
     * 
     * @param tSales sales to be added
     */
    public void addSales(double tSales) {
        totalSales += tSales;
    }
    
    /**
     * Pays this staffmember
     */
    public double pay() {

        double amt = super.pay();
        
        double payment = amt + commRate * totalSales;
        totalSales = 0;
        return payment;
    }
}
