package com.pluralsight.data;

import com.pluralsight.model.Order;

public class OrderManager {

    private Order order;

    //start order method
        public void startNewOrder(){
            this.order = new Order();
        }

    //get current order

    public Order getCurrentOrder() {
        return order;
    }


    //cancel order

    public Order cancelOrder() {
        return order = null;
    }
}
