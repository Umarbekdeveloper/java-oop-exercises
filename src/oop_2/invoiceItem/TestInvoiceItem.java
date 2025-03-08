package oop_2.invoiceItem;

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem invoiceItem = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(invoiceItem);
        InvoiceItem invoiceItem2 = new InvoiceItem("A101", "Pen Red", 999, 0.99);
        System.out.println(invoiceItem2);
        System.out.println("Id is "+invoiceItem2.getId());
        System.out.println("desc is "+invoiceItem2.getDesc());
        System.out.println("qty is "+invoiceItem2.getQty());
        System.out.println("unitPrice is "+invoiceItem2.getUnitPrice());
        System.out.println("The Total is "+invoiceItem2.getTotal());
    }
}
