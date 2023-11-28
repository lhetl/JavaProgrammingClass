package Assignment.Assignment4.B.Question10_8;

public class Test10_8 {
    public static void main(String[] args) {
        double[] rates2001= {0.15,0.275,0.305,0.355,0.391};
        double[] rates2009={0.1,0.15,0.25,0.28,0.33,0.35};
        int[][] brackets2001={
                {27050,65550,136750,297350},
                {45200,109250,166500,297350},
                {22600,54620,83250,148675},
                {36250,93650,151650,297350}};
        int[][] brackets2009={
                {8350,33950,82250,171550,372950},
                {16700,67900,137050,20885,372950},
                {8350,33950,68525,104425,186475},
                {11950,45500,117450,190200,372950}
        };
        System.out.println("==============================2001Tax==================");
        for(int taxableIncome=50000;taxableIncome<=60000;taxableIncome+=1000){
            System.out.println("taxableIncome: "+taxableIncome);
            Tax tax2001=new Tax(FilingStatus.SINGLE_FILER,brackets2001,rates2001,taxableIncome);
            FilingStatus[] arr=FilingStatus.values();
            for (FilingStatus filingStatus : arr){
                tax2001.setFilingStatus(filingStatus);
                System.out.println(filingStatus.toString()+":  "+tax2001.getTax());
            }
            System.out.println("\n");
        }
        System.out.println("==============================2009Tax===============================\n");
        for(int taxableIncome=50000;taxableIncome<=60000;taxableIncome+=1000){
            System.out.println("TaxableIncome: "+taxableIncome);
            Tax tax2009=new Tax(FilingStatus.SINGLE_FILER,brackets2009,rates2009,taxableIncome);
            FilingStatus[] arr=FilingStatus.values();
            for (FilingStatus filingStatus : arr){
                tax2009.setFilingStatus(filingStatus);
                System.out.println(filingStatus.toString()+":  "+tax2009.getTax());
            }
            System.out.println("\n");
        }


    }
}
