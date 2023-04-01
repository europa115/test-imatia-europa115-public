package com.imatia.statemachine.service.mapper;


import com.imatia.statemachine.dto.OrderTrackingsDto;
import com.imatia.statemachine.data.entity.OrderTrackings;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
public class OrderTrackingServiceMapper extends AbstractServiceMapper<OrderTrackings, OrderTrackingsDto> {
    private final ModelMapper modelMapper = new ModelMapper();

    public OrderTrackingsDto toDto(OrderTrackings orderTrackings) {
        return modelMapper.map(orderTrackings, OrderTrackingsDto.class);
    }

    public OrderTrackings toEntity(OrderTrackingsDto orderTrackingsDto) {
        return modelMapper.map(orderTrackingsDto, OrderTrackings.class);
    }

}


