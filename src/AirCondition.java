public class AirCondition {
    private String brandName;
    private String number;
    private double pride;
    private int percentPromotion;

//    private double totalPride = pride - (pride*percentPromotion);

    public AirCondition(String brandName, String number, double pride, int percentPromotion) {
        this.brandName = brandName;
        this.number = number;
        this.pride = pride;
        this.percentPromotion = percentPromotion;
    }


    public String getBrandName() {
        return brandName;
    }

    public String getNumber() {
        return number;
    }

    public double getPride() {
        return pride;
    }

    public int getPercentPromotion() {
        return percentPromotion;
    }

//    public double getTotalPride() {
//        return totalPride;
//    }

    @Override
    public String toString() {
        return "AirCondition{" +
                "brandName='" + brandName + '\'' +
                ", number='" + number + '\'' +
                ", pride=" + pride +
                ", percentPromotion=" + percentPromotion +
                '}';
    }
}

class MainOfAirCondition{
    public static void main(String[] args) {
        AirCondition myMomAir = new AirCondition("LG","1450394513",25000,10);
        AirCondition myDadAir = new AirCondition("Samsung","14122586",30000,15);

        System.out.println(myDadAir);
        System.out.println(myMomAir);
    }
}
