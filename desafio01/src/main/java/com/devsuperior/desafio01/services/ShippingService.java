package com.devsuperior.desafio01.services;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {

        double shipmentValue = 0;

        if( order.getBasic() < 100){
            shipmentValue = 20;
        } else if (order.getBasic() >= 100 && order.getBasic() < 200) {
            shipmentValue = 12;
        }

        return shipmentValue;
    }
}
