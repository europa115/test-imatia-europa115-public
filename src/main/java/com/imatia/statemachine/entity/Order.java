package com.imatia.statemachine.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;


/*@Entity(name="ORDERS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    @Column(nullable = false)
    private Integer trackingStatusId;
    @Column(nullable = false)
    private Date changeStatusDate;
    @OneToOne
    private TrackingStatus trackingStatus;
}
*/