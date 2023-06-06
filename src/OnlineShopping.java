import java.util.Scanner;

public class OnlineShopping {

    private String purchaseDescription;
    private double value;

    public String getPurchaseDescription() {
        return purchaseDescription;
    }

    @Override
    public String toString() {
        return "OnlineShopping{" +
                "purchaseDescription='" + purchaseDescription + '\'' +
                ", value=" + value +
                '}';
    }

    public double getValue() {
        return value;
    }

    public OnlineShopping(String purchaseDescription, double value) {
        this.purchaseDescription = purchaseDescription;
        this.value = value;
    }
}
