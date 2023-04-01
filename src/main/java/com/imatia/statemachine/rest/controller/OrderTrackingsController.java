package com.imatia.statemachine.rest.controller;

import com.imatia.statemachine.dto.OrderTrackingListDto;
import com.imatia.statemachine.dto.OrderTrackingsDto;
import com.imatia.statemachine.data.entity.OrderTrackings;
import com.imatia.statemachine.service.OrderTrackingService;
import com.imatia.statemachine.service.mapper.OrderTrackingServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderTrackingsController {

    @Autowired
    private OrderTrackingService orderTrackingService;
    @Autowired
    private OrderTrackingServiceMapper orderTrackingServiceMapper;

    @PostMapping("/order/tracking")
    public ResponseEntity<OrderTrackingListDto> greeting(@RequestBody OrderTrackingListDto orderTrackingsDtoList) {

        try {
            for (OrderTrackingsDto orderTrackingsDto : orderTrackingsDtoList.getOrderTrackings()) {

                OrderTrackings orderTrackings = orderTrackingServiceMapper.toEntity(orderTrackingsDto);
                orderTrackingService.insertOrderTracking(orderTrackings);
            }
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}
