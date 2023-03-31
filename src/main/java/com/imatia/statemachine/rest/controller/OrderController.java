package com.imatia.statemachine.rest.controller;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.imatia.statemachine.dto.OrderTrackingListDto;
import com.imatia.statemachine.dto.OrderTrackingsDto;
import com.imatia.statemachine.entity.OrderTrackings;
import com.imatia.statemachine.service.OrderTrackingService;
import com.imatia.statemachine.service.mapper.OrderTrackingServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderTrackingService orderTrackingService;
    @Autowired
    OrderTrackingServiceMapper orderTrackingServiceMapper;
    @PostMapping("/order/tracking")
    public void greeting( @RequestBody OrderTrackingListDto orderTrackingsDtoList) {
        for(OrderTrackingsDto orderTrackingsDto:orderTrackingsDtoList.getOrderTrackings()){

        OrderTrackings orderTrackings=orderTrackingServiceMapper.toEntity(orderTrackingsDto);
        orderTrackingService.insertOrderTracking(orderTrackings);

        }

    }
}
