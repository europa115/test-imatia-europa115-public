package com.imatia.statemachine.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.beans.factory.annotation.Autowired;

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

    private Long ordenId;
   /* @ManyToOne
    private Order order;*/

    private Date changeStatusDate;

    private ZonedDateTime insertDate;
    private Integer trackingStatusId;

    public boolean actualizeOrderStatus (){
        return  !trackingStatusId.equals(4);

    }

    public boolean isPickedUpStatus (){

        return  trackingStatusId.equals(1);

    }
}
