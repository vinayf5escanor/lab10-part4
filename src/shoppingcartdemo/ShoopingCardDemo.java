/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcartdemo;

/**
 *
 * @author VINAY
 */
public class ShoopingCardDemo {
    
    public static void main(String args[]){
        PaymentServiceFactory factory=PaymentServiceFactory.getInstance();
        PaymentService creditS= factory.getPaymentService(PaymentServiceType.CREDIT);
        PaymentService debitS= factory.getPaymentService(PaymentServiceType.DEBIT);
        cart c=new cart();
        
        c.addproduct(new product ("tomato",20));
        c.addproduct(new product ("cheese",40));
        
        c.setPaymentService(debitS);
        c.payCart();
        
        c.setPaymentService(creditS);
        c.payCart();
        
    }
    
}
