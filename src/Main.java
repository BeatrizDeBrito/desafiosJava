import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o limite do cartão de crédito:");
        double limit = read.nextDouble();
        CreditCard card = new CreditCard(limit);

        int exit = 1;
        while (exit !=0){
            System.out.println("Digite a descrição da sua compra:");
            String description = read.next();

            System.out.println("Digite o valor da compra:");
            double value = read.nextDouble();

            OnlineShopping onlineShopping = new OnlineShopping(description,value);
            boolean purchaseCompleted = card.lauchPurchase(onlineShopping);

            if(purchaseCompleted){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                exit = read.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                exit = 0;
            }
        }

        Collections.sort(card.getPurchaseList());

        for (OnlineShopping shop : card.getPurchaseList())
            {
                System.out.println(shop.getPurchaseDescription() + "-" + shop.getValue());
            }
        System.out.println("\nSaldo do cartão: " +card.getBalance());
    }
}
