package com.imatia.statemachine.data.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderTrackings implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long ordenId;
    @NotNull
    private Date changeStatusDate;
    @NotNull
    private ZonedDateTime insertDate;
    @NotNull
    private Integer trackingStatusId;

    public boolean actualizeOrderStatus (){
        return  !trackingStatusId.equals(4);
    }

    public boolean isPickedUpStatus (){return  trackingStatusId.equals(1);}
}
