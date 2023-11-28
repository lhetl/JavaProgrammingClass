package Assignment.Assignment4.B.Question10_8;

public class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER=1;
    public static final int MARRIED_FILING_SEPARATELY=2;
    public static final int HEAD_OF_HOUSEHOLD=3;
    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;
    public Tax(){
    }
    public Tax(FilingStatus filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        setFilingStatus(filingStatus);
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }
    public double getTax(){
        int[] bracket=brackets[filingStatus];
        if(taxableIncome <=bracket[0]){
            return taxableIncome=rates[0];
        }
        int i=1;
        double tax=bracket[0]*rates[0];
        while(i<bracket.length){
            if(taxableIncome<=bracket[i]){
                return tax+(taxableIncome-bracket[i-1])*rates[i];
            }
            tax+=(bracket[i]-bracket[i-1])*rates[i];
            i++;
        }
        return tax+(taxableIncome-bracket[bracket.length-1])*rates[rates.length-1];
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }
    public void setFilingStatus(FilingStatus filingStatus){
        if (filingStatus==FilingStatus.SINGLE_FILER) {
            this.filingStatus = SINGLE_FILER;
        } else if (filingStatus==FilingStatus.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER) {
            this.filingStatus = MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER;
        } else if (filingStatus==FilingStatus.MARRIED_FILING_SEPARATELY) {
            this.filingStatus = MARRIED_FILING_SEPARATELY;
        } else if (filingStatus==FilingStatus.HEAD_OF_HOUSEHOLD){
            this.filingStatus = HEAD_OF_HOUSEHOLD;
        }
    }
    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
}
