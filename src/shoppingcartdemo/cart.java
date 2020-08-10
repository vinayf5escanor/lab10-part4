/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcartdemo;

import java.util.ArrayList;

/**
 *
 * @author VINAY
 */
public class cart {
    
    private ArrayList<product> products=new ArrayList();
    private PaymentService service;
    
    public void setPaymentService(PaymentService service){
        this.service=service;
    }
    public void payCart(){
        double totalCart=0;
        for(product pro : products){
            totalCart+=pro.getPrice();
        }
        service.processPayment(totalCart);
        
    }
    
    public void addproduct(product p){
        products.add(p);
    }
    
}
