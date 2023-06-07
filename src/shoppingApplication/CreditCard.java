package shoppingApplication;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<OnlineShopping> purchaseList;

    public List<OnlineShopping> getPurchaseList() {
        return purchaseList;
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.purchaseList = new ArrayList<>();
    }

    public boolean lauchPurchase(OnlineShopping purchase){
        if(this.balance >= purchase.getValue()){
            this.balance -= purchase.getValue();
            this.purchaseList.add(purchase);
            return true;
        }else{
            return false;
        }
    }









}
