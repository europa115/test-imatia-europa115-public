package com.imatia.statemachine.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TrackingStatus implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStatus;

    @Column(nullable = false)
    private String status;

    /*@OneToMany
    private Set<Order> orders;*/


}
