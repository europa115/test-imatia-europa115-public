package com.imatia.statemachine.repository;

import com.imatia.statemachine.entity.OrderTrackings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface OrderTrackingRepository extends JpaRepository<OrderTrackings,Long> {

    public Optional<OrderTrackings> findTopByOrdenIdOrderByIdDesc(Long id);


}
