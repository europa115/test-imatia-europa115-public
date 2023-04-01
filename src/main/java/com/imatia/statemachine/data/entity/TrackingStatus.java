package com.imatia.statemachine.data.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TrackingStatus implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStatus;

    @Column(nullable = false)
    private String status;

}
