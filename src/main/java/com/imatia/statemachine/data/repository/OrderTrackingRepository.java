package com.imatia.statemachine.data.repository;

import com.imatia.statemachine.data.entity.OrderTrackings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface OrderTrackingRepository extends JpaRepository<OrderTrackings,Long> {

    Optional<OrderTrackings> findTopByOrdenIdOrderByIdDesc(Long id);


}
