package com.imatia.statemachine.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.imatia.statemachine.entity.OrderTrackings;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class OrderTrackingListDto {

        private List<OrderTrackingsDto> orderTrackings;

        public OrderTrackingListDto(){
            orderTrackings=new ArrayList<>();
        }


}
