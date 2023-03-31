package com.imatia.statemachine.repository;

import com.imatia.statemachine.entity.TrackingStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackingStatusRepository extends JpaRepository<TrackingStatus,Integer> {
}
