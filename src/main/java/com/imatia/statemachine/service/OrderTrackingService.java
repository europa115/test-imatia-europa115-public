package com.imatia.statemachine.service;

import com.imatia.statemachine.data.entity.OrderTrackings;
import com.imatia.statemachine.data.repository.OrderTrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderTrackingService {
    @Autowired
    private OrderTrackingRepository orderTrackingRepository;

    public void insertOrderTracking(OrderTrackings orderTrackings) {
        Optional<OrderTrackings> optionalOrderTrackings = orderTrackingRepository.findTopByOrdenIdOrderByIdDesc(orderTrackings.getOrdenId());

        if (optionalOrderTrackings.isPresent()) {
            if (optionalOrderTrackings.get().actualizeOrderStatus() && !orderTrackings.isPickedUpStatus()) {
                orderTrackingRepository.save(orderTrackings);
            }
            return;
        }
        orderTrackingRepository.save(orderTrackings);
    }

}
