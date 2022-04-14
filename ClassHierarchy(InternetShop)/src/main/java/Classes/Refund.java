package Classes;

public class Refund extends Purchases {

    private String reasonWhy;

    Refund() {
    }

    public Refund(String reasonWhy, Integer dateOfPurchase) {
        this.reasonWhy = reasonWhy;
        this.dateOfPurchase = dateOfPurchase;
    }

    public void setReasonWhy() {
        this.reasonWhy = reasonWhy;
    }

    public String getReasonWhy() {
        return reasonWhy;
    }

    @Override
    public String toString() {
        return "Refund info" +
                "\nReason: " + reasonWhy +
                "\nDate of purchase: " + dateOfPurchase;
    }
}
