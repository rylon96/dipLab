package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator {
    private double minBILL = 0.00;
    private String billENTRY_ERR =
            "Error: bill must be greater than or equal to " + minBILL;
    private double goodRATE = 0.20;
    private double fairRATE = 0.15;
    private double poorRATE = 0.10;

    private double bill;
    
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }
    
    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * goodRATE;
                break;
            case FAIR:
                tip = bill * fairRATE;
                break;
            case POOR:
                tip = bill * poorRATE;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < minBILL) {
            throw new IllegalArgumentException(billENTRY_ERR);
        }
        bill = billAmt;
    }

    @Override
    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

}
