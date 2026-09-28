
package tostring;

public class SFive {

    String customerName;
    String productColor;
    int orderNumber;
    int invoiceId;

    public SFive(String customerName, String productColor, int orderNumber, int invoiceId) {
        this.customerName = customerName;
        this.productColor = productColor;
        this.orderNumber = orderNumber;
        this.invoiceId = invoiceId;
    }

    
    public String toString() {
        return "Customer Name : " + customerName +
               "\nProduct Color : " + productColor +
               "\nOrder Number : " + orderNumber +
               "\nInvoice ID : " + invoiceId;
    }
}
