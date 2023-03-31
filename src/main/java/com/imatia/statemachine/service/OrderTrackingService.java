package com.imatia.statemachine.service;

import com.imatia.statemachine.entity.OrderTrackings;
import com.imatia.statemachine.repository.OrderTrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderTrackingService {
    @Autowired
    private OrderTrackingRepository orderTrackingRepository;




    public void insertOrderTracking(OrderTrackings orderTrackings){

    Optional<OrderTrackings> optionalOrderTrackings= orderTrackingRepository.findTopByOrdenIdOrderByIdDesc(orderTrackings.getOrdenId());

    if(optionalOrderTrackings.isPresent()){

        if(optionalOrderTrackings.get().actualizeOrderStatus() && !orderTrackings.isPickedUpStatus()){

            orderTrackingRepository.save(orderTrackings);

        }
        return;
    }

        orderTrackingRepository.save(orderTrackings);

    }
    /*public OrderTrackingsDto orderTrackingsToDto (OrderTrackings orderTrackings){
        return modelMapper.map(orderTrackings,OrderTrackingsDto.class);
    }*/
}
