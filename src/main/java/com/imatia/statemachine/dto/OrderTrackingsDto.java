package com.imatia.statemachine.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import java.time.ZonedDateTime;
import java.util.Date;

@Data
public class OrderTrackingsDto {

    private Long id;
    private Integer trackingStatusId;
    @JsonProperty("orderId")
    private Long ordenId;
    private Date changeStatusDate;
    private ZonedDateTime insertDate = ZonedDateTime.now();

}
